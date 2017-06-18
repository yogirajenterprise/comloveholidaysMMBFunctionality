package com.loveholidays;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Load Prop class is for to load the properties from config.properties file
 */
public class LoadProp extends Utils {

    static Properties prop;

    static FileInputStream input;

    public String getProperty(String key)
    {
        prop = new Properties();

        try {
            input= new FileInputStream("src\\test\\Resources\\config.properties");
            prop.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
