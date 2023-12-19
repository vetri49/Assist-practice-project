package com.simplilearn.testng.GridDemo;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class GridDemo1 extends HubandNodeDemo {
	@Test(priority=1)
	public void chromeTest1() throws MalformedURLException, InterruptedException {
		hubNodeChromeDemo();
		
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		driver.close();	}
	@Test(priority=2)
	public void fireFoxTest2() throws MalformedURLException, InterruptedException
	
	{
		hubNodeFirefoxDemo();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(3000);
		driver.close();
	}

}
