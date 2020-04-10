package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {


	WebDriver driver;
	public DeleteCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	public WebElement deletecustomer;
	
	
	@FindBy(name="cusid")
	public WebElement customeridtxt;
	
	
	@FindBy(name="AccSubmit")
	public WebElement dsubmitbtn;
	
	
	public void deletecustomerlnk()
	{
		deletecustomer.click();
	}

	public void deletesubmitbtn()
	{
		dsubmitbtn.click();
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
	
	public void dinput()
	{
		customeridtxt.sendKeys("88109");
	}
}

