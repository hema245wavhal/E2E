package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
	WebDriver driver;
	public NewCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	public WebElement addcustomerlnk;
	
	
	@FindBy(name="name")
	public WebElement custnametxt;
	

	@FindBy(name="rad1")
	public WebElement radiobtn;
	

	@FindBy(name="dob")
	public WebElement dateofbirth;
	
	@FindBy(name="addr")
	public WebElement custaddresstxt;
	
	@FindBy(name="city")
	public WebElement citytxt;
	
	@FindBy(name="state")
	public WebElement statetxt;
	
	@FindBy(name="pinno")
	public WebElement pinnotxt;

	@FindBy(name="telephoneno")
	public WebElement mobilenumtxt;

	@FindBy(name="emailid")
	public WebElement emailtxt;

	@FindBy(name="password")
	public WebElement passwordtxt;
	
	@FindBy(name="sub")
	public WebElement addsubmitbtn;

	
	public void Clickaddcust()
	{
	addcustomerlnk.click();
}
	

	
	public void handleAlert()
	{
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Alert a1=driver.switchTo().alert();
				System.out.println(a1.getText());
				a1.accept();
	}

	public void EnterInput()
	{
		custnametxt.sendKeys("Sshy");
		radiobtn.getCssValue("f");
		dateofbirth.getCssValue("10,10,1995");
		custaddresstxt.sendKeys("18 Young Street");
		citytxt.sendKeys("Brampton");
		statetxt.sendKeys("CA");
		pinnotxt.sendKeys("411024");
		mobilenumtxt.sendKeys("9895874523");
		emailtxt.sendKeys("shay123.ssw@gmail.com");
		passwordtxt.sendKeys("124563");
				
		
	}
	public void ClickSubBtn()
	{
		addsubmitbtn.click();
}
}
