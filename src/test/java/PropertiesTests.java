import core.PropertiesService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertiesTests {

    private PropertiesService propertiesService;

    @AfterEach
    void setUp(){
        //propertiesService = new PropertiesService();
    }

    @BeforeEach
    void tearDown(){
        propertiesService = null;
    }

    @Test
    void testGetProperty(){
        propertiesService = new PropertiesService();

        String valueFound = propertiesService.getPropertyValue("seedDataFile");

        assertEquals("xml/seedData.xml", valueFound);
    }

    @Test
    void testSetProperty(){
        propertiesService = new PropertiesService();

        String randomNumber = String.valueOf((int) Math.floor(Math.random() * 101));

        propertiesService.setPropertyValue("testProperty", "Test" + randomNumber);

        String valueFound = propertiesService.getPropertyValue("testProperty");
        System.out.print("Test" + randomNumber);
        System.out.print(valueFound);

        assertEquals("Test" + randomNumber, valueFound);
    }
}
