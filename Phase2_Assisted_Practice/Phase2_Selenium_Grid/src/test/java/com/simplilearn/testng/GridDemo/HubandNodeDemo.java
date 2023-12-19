package com.simplilearn.testng.GridDemo;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HubandNodeDemo {

	public static WebDriver driver;
	public  static void hubNodeChromeDemo() throws MalformedURLException, InterruptedException {
		ChromeOptions co=new ChromeOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public   void hubNodeFirefoxDemo() throws MalformedURLException, InterruptedException {
		FirefoxOptions fo=new FirefoxOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),fo);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
}
