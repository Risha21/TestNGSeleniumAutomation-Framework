package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {

    private static ConfigProvider configProvider = null;
    Properties properties;

    private ConfigProvider() {
        properties = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/java/resources/configuration.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigProvider getInstance() {
        if (null == configProvider) {
            configProvider = new ConfigProvider();
        }

        return configProvider;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}
