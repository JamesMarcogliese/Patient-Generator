package test;

import core.resources.PropertiesService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

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
    void testPropertyRetrieval(){
        propertiesService = new PropertiesService();

        String value = propertiesService.getPropertyValue("seedDataFile");

        assertEquals("resources/seedData.xml", value);
    }

    /*@Test
    void testResourceFileRetrieval(){
        propertiesService = new PropertiesService();

        File file = propertiesService.getResourceFile("seedDataFile");

        assertEquals("resources/seedData.xml", value);
    }*/
}
