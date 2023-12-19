package com.simplilearn.testng.GridDemo;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridStandAloneDemo {
	 WebDriver driver;
	 
	@BeforeClass
	 public void gridStandAlone() throws MalformedURLException {
		
		DesiredCapabilities cap = null;
		cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	}
	
	@Test
	public void standAloneTest() {
		driver.get("https://tutorialsninja.com/demo/");

		String actualTitle=driver.getTitle();
		String expectedTitle="Your Store";
		assertEquals(actualTitle,expectedTitle);
	}
	@AfterClass
	public void close() {
		driver.quit();
	}

}
