package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.BasePage;
import com.util.Locators;
import com.util.PageDriver;

public class HomePage extends BasePage {

	public HomePage(PageDriver driver) {
		super(driver);
		driver.get("http://www.target.com/");
	}

	public int countIcons() {
		int count = 0;
		driver.maximize();
		List<WebElement> elements = driver.findElements(By.cssSelector(Locators.loc.get("header-icons")));
		if (!elements.isEmpty()) {
			count = elements.size();
		}
		return count;
	}

	public String clickSignin() {

		String url = null;
		driver.maximize();
		driver.findElement(By.cssSelector(Locators.loc.get("header-signin-link"))).click();
		url = driver.getCurrentUrl();
		return url;

	}
	
}
