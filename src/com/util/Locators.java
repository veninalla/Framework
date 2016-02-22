package com.util;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Locators {
	public static HashMap<String,String> loc = new HashMap<>();
	
	public static void getElements(){
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("locators.properties");
			p.load(reader);//load the reader
			
			//read
			Enumeration e = p.propertyNames();//give the name of all keys
			while(e.hasMoreElements()){
				String key = (String)e.nextElement();
				loc.put(key, p.getProperty(key));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
