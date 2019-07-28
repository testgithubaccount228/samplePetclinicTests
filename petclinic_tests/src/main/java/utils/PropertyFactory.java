package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFactory {
    private static final String PROPERTIES_FILE = "src/main/resources/testProperties.properties";
    public static Properties properties;

    public static Properties getInstance(){
        properties = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream(PROPERTIES_FILE);
            properties.load(is);
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getProperty(String propertyName) {
        getInstance();
        return properties.getProperty(propertyName);
    }
}
