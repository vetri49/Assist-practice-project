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

public class FacebookLoginSteps {
	String driverpath="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/test/resource/drivers/windows/chromedriver.exe";
	String siteurl="https://www.facebook.com";
	WebDriver driver;
	
	
	    
	
	@Before(value="@Fb2Test")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver=new ChromeDriver();
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	@After(value="@Fb2Test")
	public void cleanup() {
		driver.quit();
		
	}
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
	   driver.get(siteurl+"/login");
	}

	@Given("^User enters email address \"([^\"]*)\"$")
	public void user_enters_email_address(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	}

	@Given("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) {
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Given("User clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("Error message should be displayed with wrong credentials")
	public void error_message_should_be_displayed_with_wrong_credentials() throws InterruptedException {
		Thread.sleep(1000);
		WebElement errorEm = driver.findElement(By.className("_9ay7"));
	    Assertions.assertEquals("The email address or mobile number you entered isn't connected to an account. Find your account and log in.", errorEm.getText());
	}
	

	@Then("User return backs on login page")
	public void user_return_backs_on_login_page() {
	    
	}

}
