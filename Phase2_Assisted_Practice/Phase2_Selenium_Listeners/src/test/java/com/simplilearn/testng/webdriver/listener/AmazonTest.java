package com.simplilearn.testng.webdriver.listener;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("deprecation")
public class AmazonTest {

	public static void main(String[] args) {
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverPath);

		 
		WebDriver driver=new FirefoxDriver();
		EventFiringWebDriver  eDriver = new EventFiringWebDriver(driver);
		SWListener eListener  = new SWListener();
		
		
		eDriver.register(eListener);
		
		eDriver.get(siteUrl);
		
		eDriver.unregister(eListener);

	}

}
