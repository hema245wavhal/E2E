package com.testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.Page;
import com.pages.Loginpage;

public class LoginT extends Page {

	
	WebDriver driver;
	Loginpage lp;
	
	public static Logger log=LogManager.getLogger("MyLogger");
	
	
	  @Test
	  public void Login() {
		  driver =initConfiguration();
		  lp = new Loginpage (driver);
		  lp.DoLogin("mngr236025", "EquhAhA");
			log.debug("login successfully");
	  }
	  

	  @AfterMethod
	  public void tearDownMethod() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.quit();
	    }

		
}
