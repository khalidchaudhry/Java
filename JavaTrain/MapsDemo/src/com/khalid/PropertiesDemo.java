package com.khalid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("/Users/khalidchaudhry/MyGithubRepos/Java/JavaTrain/MapsDemo/src/com/khalid/abc.properties");
        properties.load(fis);
        System.out.println(properties);
        properties.setProperty("nag","99999");

        FileOutputStream fos=new FileOutputStream("/Users/khalidchaudhry/MyGithubRepos/Java/JavaTrain/MapsDemo/src/com/khalid/abc.properties");
        properties.store(fos,"Updated by Khalid for ");

    }
}
