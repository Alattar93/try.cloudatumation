package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();

    static {
        //2-Get path and open the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties") ;

            //3- Load the open the file into properties object
            properties.load(file);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
    //4- Use the object to read from the configuration.properties file
    public static  String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
