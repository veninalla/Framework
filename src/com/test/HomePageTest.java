package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BasePageTest;
import com.pages.HomePage;

public class HomePageTest extends BasePageTest {
	//create instance variable
	HomePage hp;
@BeforeClass	
	public void initialize(){
		hp = new HomePage(driver);
	}
@Test
public void testCountIcons(){
	int actual = hp.countIcons();
	Assert.assertEquals(actual, 5);
}
@Test
public void testSigninClick(){
	String actual = hp.clickSignin();
	Assert.assertEquals(actual, "https://gam-secure.target.com/gam-webapp/login");
	
}
@AfterClass
public void quit(){
	driver.quit();
}


}
