package com.simplilearn.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinkVerificationTest {
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
	@DisplayName("Should verify Amazon Bestsellers link")
	public void linkTest1() throws InterruptedException {
		WebElement link = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		link.click();
		Thread.sleep(1000);

		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assertions.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	@DisplayName("Should verify Amazon Deals link")
	public void linkTest2() throws InterruptedException {
		WebElement link = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));
		link.click();
		Thread.sleep(1000);
		String expectedTitle = "Amazon.in - Deals";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assertions.assertEquals(actualTitle, expectedTitle);
	}

}
