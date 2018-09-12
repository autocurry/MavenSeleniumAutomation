package com.tests;
import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ApplicationFunctionalTests {
	
	WebDriver _driver;
	
	@Test
	public void TestGuru1()
	{
		System.out.println("inside testng test1");
		_driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = _driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}
	
	@Test
	public void TestGuru2()
	{
		System.out.println("inside testng test2");
	}
	
	@Test
	public void TestGuru3()
	{
		System.out.println("inside testng test3");
	}
	
	
	@BeforeTest
	public void Init()
	{	
		
		System.out.println("inside before method test");
		
		System.setProperty("webdriver.gecko.driver","C:\\Tools\\firefoxdriver\\geckodriver.exe");		 
		_driver = new FirefoxDriver();
		_driver.get("http://www.google.com");			
		
		
	}
	
	@AfterTest
	public void Teardown()
	{
		System.out.println("inside after method test");
		_driver.quit();
	}

}
