package com.ninja.qa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Bases.TestBase;
import com.ninja.qa.pages.SearchPage;


public class SearchPageTest extends TestBase{
	SearchPage sp;
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		sp.searchproduct();
		Thread.sleep(1000);
		sp.selectproduct();
	}
}
