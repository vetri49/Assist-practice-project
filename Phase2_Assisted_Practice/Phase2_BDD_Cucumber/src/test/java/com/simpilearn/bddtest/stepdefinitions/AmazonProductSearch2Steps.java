package com.simpilearn.bddtest.stepdefinitions;

import java.time.Duration;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonProductSearch2Steps {
	String driverpath="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/test/resource/drivers/windows/chromedriver.exe";
	String siteurl="https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	
	
	    
	
	@Before(value="@AmazonSearchTest")
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver=new ChromeDriver();
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	@After(value="@AmazonSearchTest")
	public void cleanup() {
		driver.quit();
		
	}
	@Given("Launch Amazon application on chrome")
	public void launch_amazon_application_on_chrome() {
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("Enter  search product {string}")
	public void enter_search_product(String name) throws InterruptedException {
		Thread.sleep(2000);
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(name);
		Thread.sleep(2000);
	}
	@Then("Submit product search")
	public void submit_product_search() {
		searchBox.submit();
	  
	}

	@Then("Verify page title {string}")
	public void verify_page_title(String title) {
		Assertions.assertEquals(title,driver.getTitle());
	    
	}


}
