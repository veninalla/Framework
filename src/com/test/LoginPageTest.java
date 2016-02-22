package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BasePageTest;
import com.pages.LoginPage;

public class LoginPageTest extends BasePageTest {
	LoginPage lp;
	
@BeforeClass	
	public void initialize(){
		lp = new LoginPage(driver);
	}
@DataProvider(name="user-data")
public Object[][] getUserData(){
	Object[][] data = {{"veniperumal@hotmail.com","abcd"},{"nalla@hotmail.com", "nalla"}};
	return data;
	
}

@Test(dataProvider="user-data")
public void testPerformSignin(String userName, String pwd){
	String actual = lp.performSignin(userName, pwd);
	Assert.assertEquals(actual, "Sorry, either your e-mail or password didn't match what we have on file. Try it again?");
	
	
}
@AfterClass
public void quit(){
	driver.quit();
}
}
