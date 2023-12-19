package com.simplilearn.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest {

	String siteUrl = "https://accounts.simplilearn.com/user/login";
	String driverPath = "drivers/windows/geckodriver.exe";
	WebDriver driver;
	WebDriverWait wait;

	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@BeforeMethod
	public void beforeTest() {
		System.setProperty("webdriver.geckodriver.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void signInTest() {

		try {
			File src = new File("test-data\\test-data-login.xlsx");
			FileInputStream fileInput = new FileInputStream(src);
			workbook = new XSSFWorkbook(fileInput);
			sheet = workbook.getSheetAt(0);

			for (int row = 1; row < sheet.getLastRowNum(); row++) {
				cell = sheet.getRow(row).getCell(1);
				cell.setCellType(CellType.STRING);
				driver.findElement(By.name("user_login")).sendKeys(cell.getStringCellValue());
				cell = sheet.getRow(row).getCell(2);
				cell.setCellType(CellType.STRING);
				driver.findElement(By.name("user_pwd")).sendKeys(cell.getStringCellValue());

				driver.findElement(By.name("btn_login")).submit();

				driver.findElement(By.name("user_login")).clear();

				Thread.sleep(400);
				FileOutputStream foutput=new FileOutputStream(src);
				String message = "Faliure Login Test";
				sheet.getRow(row).createCell(3).setCellValue(message);
				FileOutputStream fileOutput =new FileOutputStream(src);
				workbook.write(fileOutput);
				fileOutput.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
