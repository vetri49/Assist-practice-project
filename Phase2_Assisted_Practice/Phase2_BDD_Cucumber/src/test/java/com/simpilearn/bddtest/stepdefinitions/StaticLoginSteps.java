package com.simpilearn.bddtest.stepdefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticLoginSteps {
	String driverpath="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/test/resource/drivers/windows/chromedriver.exe";
	String siteurl="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/main/resource/static/Login.html";
	WebDriver driver;
	
	@Given("Open the Chrome and Launch the test application")
	public void open_the_chrome_and_launch_the_test_application() {
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    driver=new ChromeDriver();
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Given("Maximize the browser window")
	public void maximize_the_browser_window() {
		driver.manage().window().maximize();
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("kennady@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kennady111");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("Login")).submit();
		
	}

	@Then("User Navigated to successful login")
	public void user_navigated_to_successful_login() {
		WebElement sresponse=driver.findElement(By.id("sreponse"));
		Assertions.assertEquals(sresponse.getText(),"Successful login");
	}

}
