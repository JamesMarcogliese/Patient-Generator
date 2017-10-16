package randomizer;

import core.PropertiesService;
import core.model.common.Patient;
import randomizer.common.GivenNameGenderPair;
import randomizer.common.SeedData;
import randomizer.utilities.OHIPUtil;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class RandomizerService {
    private SeedData seedData;

    public RandomizerService() {

        try {
            seedData = loadData(new PropertiesService().getPropertyValue("seedDataFile"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private SeedData loadData(String filename) throws IOException {

        if (filename == null || Objects.equals(filename, "".trim())){
            throw new IOException("Filename cannot be null.");
        }

        //File file = new File(filename);

        //URL path = this.getClass().getResource("config.properties");
        File file = new PropertiesService().getResourceFile(filename);

        SeedData seedData = new SeedData();

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(SeedData.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            seedData = (SeedData) jaxbUnmarshaller.unmarshal(file);


        } catch (JAXBException e){
            e.printStackTrace();
        }

        return seedData;
    }

    public Patient getRandomPatient(){

        GivenNameGenderPair nameGenderPair = seedData.getGivenNames()
                .get(ThreadLocalRandom.current()
                        .nextInt(0, seedData.getGivenNames().size()));

        String firstName = nameGenderPair.getName();
        String middleName = seedData.getGivenNames().get(ThreadLocalRandom.current()
                                                    .nextInt(0, seedData.getGivenNames().size())).getName();
        String lastName = seedData.getFamilyNames().get(ThreadLocalRandom.current()
                                                   .nextInt(0, seedData.getFamilyNames().size() - ThreadLocalRandom.current()
                                                                                                                .nextInt(0, seedData.getFamilyNames().size())));
        String postal = null;

        for (int i = 0; i < 6; i++){
            if (i % 2 == 0){
                postal += (char)((byte)'A' + ThreadLocalRandom.current().nextInt(0, 20));
            } else
                postal += Integer.toString(ThreadLocalRandom.current().nextInt(0, 10));
            if (i == 2)
                postal += '-';
        }

        Patient patient = new Patient();
        patient.setAddressLine(Integer.toString(ThreadLocalRandom.current()
                .nextInt(0, 400)) + " " + seedData.getStreetNames().get(ThreadLocalRandom.current()
                .nextInt(0, seedData.getStreetNames().size())));
        patient.setCity(seedData.getCities().get(ThreadLocalRandom.current().nextInt(0, seedData.getCities().size())));
        patient.setCountry("Canada");
        patient.setDateOfBirth(LocalDateTime.of(ThreadLocalRandom.current().nextInt(1930,2014),
                ThreadLocalRandom.current().nextInt(1, 11),
                ThreadLocalRandom.current().nextInt(1, 28),
                0,
                0,
                0,
                0));
        patient.setEmail((firstName + "." + lastName +  ThreadLocalRandom.current().nextInt(0, 1000) + "@example.com").toLowerCase());
        patient.setFirstName(firstName);
        patient.setGender(nameGenderPair.getGenderCode());
        patient.setHealthCardNo(new OHIPUtil().generateHealthNumber());
        patient.setLanguage("eng");
        patient.setLastName(lastName);
        patient.setMiddleName(middleName);
        patient.setPhoneNo("905575" + ThreadLocalRandom.current().nextInt(1000, 9999));
        patient.setPostalCode(postal);
        patient.setProvince("Ontario");

        return patient;
    }
}
