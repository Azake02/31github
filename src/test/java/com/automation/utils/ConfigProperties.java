package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigProperties {
    static Properties properties = new Properties();

    public static void initProperties(){
        try{
            properties = new Properties();
            properties.load(new FileReader("src/test/resources/config/config.properties"));

        } catch (Exception e){

        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}

