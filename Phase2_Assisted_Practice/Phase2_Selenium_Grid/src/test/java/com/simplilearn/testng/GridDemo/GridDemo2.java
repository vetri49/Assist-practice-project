package com.simplilearn.testng.GridDemo;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class GridDemo2 extends HubandNodeDemo{
	@Test(priority=1)
	public void chromeTest1() throws MalformedURLException, InterruptedException {
		hubNodeChromeDemo();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(priority=2)
	public void firefoxTest2() throws MalformedURLException, InterruptedException {
		hubNodeFirefoxDemo();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
	    driver.quit();
		
	}

}
