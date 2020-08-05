package com.capg.bdd.pages;

import com.capg.bdd.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	@FindBy(id="username")
	WebElement uname;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath=".//input[@value='Login']")
	WebElement login;
	
	public void enterCredentials(String user,String pass)
	{
		uname.sendKeys(user);
		password.sendKeys(pass);
		
	}
	
	public void  submit()
	{
		login.click();
		
	}
	
	public String titlePage()
	{
		return driver.getTitle();
	}
	
	
	
	

}
