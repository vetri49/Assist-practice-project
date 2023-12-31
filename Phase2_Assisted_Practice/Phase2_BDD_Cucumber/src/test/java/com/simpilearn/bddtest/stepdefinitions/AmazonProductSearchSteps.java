package com.simpilearn.bddtest.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonProductSearchSteps {
	String driverpath="C:/Phase2_Eclipse_Workspace/Phase2_BDD_Cucumber/src/test/resource/drivers/windows/chromedriver.exe";
	String siteurl="https://www.amazon.in/";
	WebDriver driver;
	
	@Given("Open chrome browser and Amazon application")
	public void open_chrome_browser_and_amazon_application() {
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver=new ChromeDriver();
	    driver.get(siteurl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    
	}

	@Given("Maximize browser window size")
	public void maximize_browser_window_size() {
	    driver.manage().window().maximize();
	}

	@Then("Enter the product search")
	public void enter_the_product_search(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		 System.out.println(">>>>>>>>>>>>"+ dataList);
		for(Map<String, String> data : dataList) {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys(data.get("name"));
			searchBox.submit();
			Thread.sleep(2000);
			//searchBox.clear();
			
		}
		Thread.sleep(2000);
	    
	}

	@Then("Submit Search for the product")
	public void submit_search_for_the_product() {
	    
	}

	@Then("Clear search")
	public void clear_search() {
	    
	}

}
