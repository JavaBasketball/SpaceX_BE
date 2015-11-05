package com.spacex.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesUtil {
	public PropertiesUtil(){}
	private static Properties proper = new Properties(); 
	static{
		try {
			proper.load(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getValue(String key){
		return proper.getProperty(key);
	}

    public static void updateProperties(String key,String value) {    
    	proper.setProperty(key, value); 
    } 
}
