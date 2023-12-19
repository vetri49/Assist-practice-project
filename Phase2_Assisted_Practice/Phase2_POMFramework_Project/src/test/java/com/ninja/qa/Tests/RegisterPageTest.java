package com.ninja.qa.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninja.qa.Bases.TestBase;
import com.ninja.qa.pages.HomePage;
import com.ninja.qa.pages.RegisterPage;

public class RegisterPageTest extends TestBase implements st {

	private static final String Xls_DataProvider = null;
	HomePage hp;
	RegisterPage rp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			hp = new HomePage(driver);
			rp = new RegisterPage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		
		@Test(priority='1', dataProvider="testdata")
		public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
		{
			hp.clickonMyAccount();
			hp.clickonRegister();
			rp.regirsteruser(name,lname,email,ph,password,cpasswd);
		}
		
}
