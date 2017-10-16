package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Represents a service to access the properties file.
 */
public class PropertiesService {

    /**
     * Initializes a new instance of the PropertiesService class.
     */
    public PropertiesService() {
    }

    /**
     * Gets a property value from the properties file specified by key.
     * @param key Key of the property to retrieve.
     * @return value
     */
    public String getPropertyValue(String key){

        Properties properties = new Properties();
        InputStream input = null;
        String value = "";

        try {
            URL path = PropertiesService.class.getClassLoader().getResource("properties/config.properties");
            File file = new File(path.getFile());
            input = new FileInputStream(file);

            properties.load(input);
            value = properties.getProperty(key);
        } catch (IOException e){
            e.printStackTrace();
        }

        return value;
    }

    /**
     * Gets the properties file in the resource folder specified by filename.
     * @param filename Properties file filename.
     * @return file
     */
    public File getResourceFile(String filename){

        URL path = PropertiesService.class.getClassLoader().getResource(filename);
        File file = new File(path.getFile()).getAbsoluteFile();
        return file;
    }

}
