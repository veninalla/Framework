package com.util;

import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	//variables
	public String URL;
	public String Browser;
	
	public Configuration(){
		readProps();
	}
	
	//read a file to filereader
	public void readProps(){
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("config.properties");
			p.load(reader);//load the reader
			
			URL = p.getProperty("url");
			Browser = p.getProperty("browser");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
