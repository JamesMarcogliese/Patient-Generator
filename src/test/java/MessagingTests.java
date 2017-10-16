import core.model.Metadata;
import core.model.componentModel.*;
import messaging.messageReceiver.GenerationService;
import messaging.model.GenerationResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MessagingTests {
    private Demographic options;
    private GenerationService service;

    @AfterEach
    void tearDown(){
        options = null;
        service = null;
    }

    @BeforeEach
    void setUp() {
        options = new Demographic();

        ArrayList<Address> addresses = new ArrayList<>();

        Address address1 = new Address();
        address1.setCity("Friedberg");
        address1.setCountry("Germany");
        address1.setStateProvince("Tempa");
        address1.setStreetAddress("Grüner Weg 6");
        address1.setZipPostalCode("61169");
        addresses.add(address1);

        Address address2 = new Address();
        address2.setCity("Salinas");
        address2.setCountry("United States of America");
        address2.setStateProvince("California");
        address2.setStreetAddress("30 Mortensen Avenue");
        address2.setZipPostalCode("93905");
        addresses.add(address2);

        Address address3 = new Address();
        address3.setCity("Friedberg");
        address3.setCountry("Germany");
        address3.setStateProvince("Elbonia");
        address3.setStreetAddress("Grüner Weg 6");
        address3.setZipPostalCode("578233");
        addresses.add(address3);

        options.setAddresses(addresses);

        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setExact(LocalDateTime.of(
                ThreadLocalRandom.current().nextInt(1900, 2014),
                ThreadLocalRandom.current().nextInt(1, 12),
                ThreadLocalRandom.current().nextInt(1, 28),
                0,
                0,
                0,
                0));
        options.setDateOfBirthOptions(dateOfBirthOptions);

        options.setGender("M");

        Metadata metadata = new Metadata();
        metadata.setSendingFacility("SEEDING");
        metadata.setSendingApplication("SEEDER");
        metadata.setReceivingFacility("Test");
        metadata.setReceivingApplication("CRTEST");
        metadata.setAssigningAuthority("1.3.6.1.4.1.33349.3.1.2.99121.283");
        metadata.setUseHL7v2(true);
        options.setMetadata(metadata);

        ArrayList<Name> names = new ArrayList<>();
        Name name = new Name();
        name.setFirstName("Larry");
        name.setLastName("McDavid");
        names.add(name);
        options.setNames(names);

        ArrayList<AlternateIdentifier> alternateIdentifiers = new ArrayList<>();

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        String seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier1 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.0." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier1);

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier2 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.1." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier2);

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier3 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.2." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier3);

        // ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier4 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.3." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier4);

        options.setOtherIdentifiers(alternateIdentifiers);

        options.setPersonIdentifier(UUID.randomUUID().toString());

        service = new GenerationService();
    }

    @Test
    void testDateOfBirthRange(){
        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setStart(LocalDateTime.of(1925, 01, 01, 00, 0));
        dateOfBirthOptions.setEnd(LocalDateTime.of(1990, 12, 31, 00, 0));
        options.setDateOfBirthOptions(dateOfBirthOptions);

        GenerationResponse result = service.generatePatients(options);

        assertFalse(result.hasErrors());
    }

    @Test
    void testDateOfBirthRangeNoEnd(){
        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setStart(LocalDateTime.of(1925, 01, 01, 00, 0));
        dateOfBirthOptions.setExact(LocalDateTime.now());
        options.setDateOfBirthOptions(dateOfBirthOptions);

        GenerationResponse result = service.generatePatients(options);

        assertTrue(result.hasErrors());
    }

    @Test
    void testDateOfBirthRangeNoStart(){
        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setEnd(LocalDateTime.of(1990, 12, 31, 00, 0));
        dateOfBirthOptions.setExact(LocalDateTime.now());
        options.setDateOfBirthOptions(dateOfBirthOptions);

        GenerationResponse result = service.generatePatients(options);

        assertTrue(result.hasErrors());
    }

    @Test
    void testDateOfBirthRangeWithExact(){
        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setStart(LocalDateTime.of(1925, 01, 01, 00, 0));
        dateOfBirthOptions.setEnd(LocalDateTime.of(1990, 12, 31, 00, 0));
        dateOfBirthOptions.setExact(LocalDateTime.now());
        options.setDateOfBirthOptions(dateOfBirthOptions);

        GenerationResponse result = service.generatePatients(options);

        assertTrue(result.hasErrors());
    }

    @Test
    void testEmptyDateOfBirth() {
        options.setDateOfBirthOptions(null);

        GenerationResponse result = service.generatePatients(options);

        assertFalse(result.hasErrors());
    }

    @Test
    void testNullAssigningAuthorityV2() {
        Metadata metadata = new Metadata();
        metadata.setSendingFacility(null);
        metadata.setSendingApplication(null);
        metadata.setReceivingFacility(null);
        metadata.setReceivingApplication(null);
        metadata.setAssigningAuthority(null);
        metadata.setUseHL7v2(true);
        options.setMetadata(metadata);

        GenerationResponse result = service.generatePatients(options);

        assertTrue(result.hasErrors());
    }

    @Test
    void testNullAssigningAuthorityV3() {
        Metadata metadata = new Metadata();
        metadata.setSendingFacility(null);
        metadata.setSendingApplication(null);
        metadata.setReceivingFacility(null);
        metadata.setReceivingApplication(null);
        metadata.setAssigningAuthority(null);
        metadata.setUseHL7v2(false);
        options.setMetadata(metadata);

        GenerationResponse result = service.generatePatients(options);

        assertTrue(result.hasErrors());
    }
}
