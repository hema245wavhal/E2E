package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
			//Find a Web Element
	@FindBy(name="uid")
	public WebElement userid;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(name="btnLogin")
	public WebElement loginbtn;
	
	
	//Create a method
	public void DoLogin(String myusername, String mypassword)
	{ 
		userid.sendKeys(myusername);
	pass.sendKeys(mypassword);
	loginbtn.click();
	}
	
}
