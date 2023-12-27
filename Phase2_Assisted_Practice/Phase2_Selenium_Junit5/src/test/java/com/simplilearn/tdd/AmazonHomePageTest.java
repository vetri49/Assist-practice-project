package com.simplilearn.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageTest {
	private WebDriver driver;
	String siteUrl="https://www.amazon.in/";
	String driverpath="drivers/windows/geckodriver.exe";
	@BeforeEach
	public void setup() {
		
		System.setProperty("webdriver.geckodriver.driver", driverpath);
		driver=new FirefoxDriver();
		driver.get(siteUrl);
	}
	@AfterEach
	public void cleanup() {
		driver.quit();
	}
	@Test
	@RepeatedTest(value = 3 , name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Should validate Amazon Homepage title")
	void testAmazonHomePageTitle() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	@DisplayName("Should validate Amazon Homepage source url")
	public void testAmazonHomePageSourceUrl() {
		Assertions.assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@Test
	@DisplayName("Should validate Amazon Homepage for invalid title")
	public void testAmazonHomePageTitle2() {
		String expectedTitle = "OOnline SShopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assertions.assertNotEquals(actualTitle, expectedTitle);
	}
	

}
