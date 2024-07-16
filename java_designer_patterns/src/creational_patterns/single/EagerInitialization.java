package creational_patterns.single;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private Properties properties;

    private EagerInitialization(){
        properties = new Properties();
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            if(input != null){
                properties.load(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
