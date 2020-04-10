package com.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Page;
import com.pages.DeleteCustomer;
import com.pages.Loginpage;


public class ValidateDeleteCustomer extends Page {
	
	WebDriver driver;
	DeleteCustomer dc;
	Loginpage lp;
	
	public static Logger log=LogManager.getLogger("MyLogger");
			
	@Test
	public void Enterdcustid()
	{
		driver =initConfiguration();
		  lp = new Loginpage (driver);
		  lp.DoLogin("mngr236025", "EquhAhA");
		
		dc = new DeleteCustomer (driver);
		dc.deletecustomerlnk();
		log.debug("delete customer clicked");
		dc.dinput();
		dc.deletesubmitbtn();
		log.debug("click submit btn");
	try
	{
		dc.handleAlert();
		log.debug("Successfully handled Alert");
	}
	catch(Exception e)
	{
		System.out.println("no alert present");
	}
		}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}

