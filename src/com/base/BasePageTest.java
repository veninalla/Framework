package com.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;
import com.util.Locators;
import com.util.PageDriver;

public abstract class BasePageTest {
	
//the value will not change for onetime atleast
	public static final Configuration _config;
	
	//run before anything in the class to access from the config.file
	static{
		_config = new Configuration();
	}
	
	public PageDriver driver;
	
	
	@BeforeClass  //executed before all classes of anything
	public void setUp(){
		driver = new PageDriver(_config);
		Locators.getElements();
	}
	
    @AfterClass
    public void tearDown() {
    	//driver.quit();
    }
}
