package core;

import java.io.*;
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
            input.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        return value;
    }

    /**
     * Sets a property value from the properties file specified by key.
     * @param key The property key to set value on.
     * @param  value The value to be set on the property key.
     */
    public void setPropertyValue(String key, String value){

        Properties properties = new Properties();
        OutputStream output = null;
        InputStream input = null;

        try{
            URL path = PropertiesService.class.getClassLoader().getResource("properties/config.properties");
            File file = new File(path.getFile());

            // Due to the nature of using a text properties file, all existing keys in the file must be retrieved and re-stored.

            input = new FileInputStream(file);
            properties.load(input);
            input.close();

            output = new FileOutputStream(file);
            properties.setProperty(key, value);
            properties.store(output, null);
            output.close();

        } catch (IOException e){
            e.printStackTrace();
        }
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
