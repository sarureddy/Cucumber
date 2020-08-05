package com.capg.bdd.stepDef;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capg.bdd.pages.LoginPage;

public class LoginStepDef extends LoginPage {
	
	LoginPage login;
	
	@Before
	public void init()
	{
		login=new LoginPage();
		
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		login.loadPage();
	
	}

//	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String arg1, String arg2) throws Throwable {
//		
//		driver.findElement(By.id("username")).sendKeys(arg1);
//		driver.findElement(By.id("password")).sendKeys(arg2);
//	   
//	}
	



    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
   public void user_enters_and(String arg1, String arg2) throws Throwable {
     login.enterCredentials(arg1, arg2);
	   
	}
	 
//	@When("^user enters un and pw$")
//	public void user_enters_un_and_pw(DataTable arg1) throws Throwable {
//	    List<String> data=arg1.topCells();
//	    driver.findElement(By.id("username")).sendKeys(data.get(0));
//		driver.findElement(By.id("password")).sendKeys(data.get(1));
//	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		login.submit();
	   
	}

	@Then("^user is on regis page$")
	public void user_is_on_regis_page() throws Throwable {
	  
	    Assert.assertEquals("My Account – Automation Practice Site", login.titlePage());
	}

}
