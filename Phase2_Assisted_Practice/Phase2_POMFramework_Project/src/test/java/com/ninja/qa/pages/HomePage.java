package com.ninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Bases.TestBase;

public class HomePage extends TestBase{
	Actions a = new Actions(driver);
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktop;
	
	@FindBy(linkText ="Mac (1)")
	WebElement macdropdown;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
    public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void clickonMyAccount()
	{
		myaccount.click();
	}
	public void clickonLogin()
	{
		login.click();
	}
	
	public void clickonRegister()
	{
	register.click();
	}
	
	public void clickOnMac() throws InterruptedException
	{
	    a.moveToElement(desktop).build().perform();
	    
	    Thread.sleep(1500);
	    
	    macdropdown.click();
	}
	

}
