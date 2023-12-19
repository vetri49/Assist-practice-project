package com.simplilearn.testng.GridDemo;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StandAloneChrome {

	WebDriver driver;
	@BeforeClass
	public void standAloneCherome() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
	}
	@Test
	public void gridStandAloneTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String expectedTitle="Your Store";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		assertEquals(expectedTitle,actualTitle);
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
}
