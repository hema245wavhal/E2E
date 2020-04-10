package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;



public class Page {
	
	/*
	 * WebDriver
	 * ExcelReader
	 * Logs
	 * Wait
	 * ExtentReports
	 */
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("MLogger");
	
		
	public static WebDriver initConfiguration() {
		
		if(Constants.browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Launching Chrome Browser");
		
		}
		driver.get(Constants.testUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C://test//"+result+"screenshot.png");
	FileUtils.copyFile(src, dest);
	}
	@AfterTest
	public static void quitBrowser() {
		driver.quit();
		log.debug("Closing Browser");
		
		
	}

	
}
