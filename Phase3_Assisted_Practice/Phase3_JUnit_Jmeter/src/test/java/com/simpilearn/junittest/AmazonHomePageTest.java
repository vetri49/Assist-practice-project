package com.simpilearn.junittest;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonHomePageTest {
	WebDriver driver;
	String siteurl = "https://www.amazon.in/";
	String driverpath = "C:\\Phase2_Eclipse_Workspace\\Phase3_JUnit_Jmeter\\drivers\\windows\\chromedriver.exe";

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver = new ChromeDriver();
		driver.get(siteurl);
	}

	@After
	public void cleanup() {
		driver.quit();
	}

	@Test
	public void homePageTitleTest() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void homePageSOurceUrlTest() {
		String url = driver.getCurrentUrl();
		assertEquals(siteurl, url);
	}

	@Test
	public void homePageTitleTest2() {
		String actualTitle = "Online Shopping site in India: Shop Online for Mobile,Book, Watches, Shoes and More - Amazon.in";
		assertNotEquals(actualTitle, driver.getTitle());
	}
}
