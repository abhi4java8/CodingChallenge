package com.lohis.javabasics;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@PropertySource("classpath:credential.properties")
public class PropertiesTest {

//    @Value("${username}")
//    @Value("Test")
//    private static String dbUserName;

    public static void main(String[] args) throws IOException {
        Properties prop = reaPropertiesFile("/Users/abhilash/DEVLAB/REPOS1/CodingChallenge/src/main/resources/credential.properties");
        System.out.println("User Name : " + prop.get("username"));
        System.out.println("Password  : " + prop.get("password"));
//        System.out.println("DB User Name : " + dbUserName);
    }

    private static Properties reaPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try{
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fis.close();
        }
        return prop;
    }
}
