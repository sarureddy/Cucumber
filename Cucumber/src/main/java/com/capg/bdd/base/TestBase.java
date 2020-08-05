package com.capg.bdd.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	Properties properties;
	
	
	public TestBase() {
		
		try
		{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\USER\\workspace\\Cucumber\\config\\config.properties");
		properties.load(fis);
		String browser=properties.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
	    System.setProperty("webdriver.chrome.driver","C:\\selenium\\chrome 83\\chromedriver.exe");
		driver=new ChromeDriver();
	
		}
		
		}
		
		catch(FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
		
	}
		
		public void loadPage()
		
		{
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		
		
		
	}
	


