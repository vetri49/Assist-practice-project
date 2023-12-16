package com.simplilearn.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {

	static String siteurl="https://www.amazon.in";
	static String driverpath="drivers/windows/chromedriver.exe";
	static WebDriver driver;
	public static void main(String []a) {
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("extentreport.html");
		ExtentReports extentreport=new ExtentReports();
		extentreport.attachReporter(htmlReporter);
		ExtentTest test1=extentreport.createTest("Amazon Title Match Test", "Test Amazon Home Page Title Match");
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chromedriver.driver", driverpath);
		driver=new ChromeDriver();
		test1.log(Status.INFO,"start test case");
		driver.manage().window().maximize();
		test1.pass("maximize the browser window");
		driver.get(siteurl);
		test1.pass("Navigate Open www.amazon.in");

		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		test1.pass("The title are matched");

		driver.quit();
		test1.pass("The Browser is quited");

		test1.log(Status.INFO, "Completed test case");

		extentreport.flush();
		
		
	}
}
