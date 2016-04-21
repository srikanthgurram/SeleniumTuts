package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdowns {
	WebDriver driver;
	
	@BeforeClass
	public void initiate(){
		driver = new FirefoxDriver();
		driver.get("http://www.techspotindia.com");
	}
	
	@Test
	public void testDropdown(){
		
	}
	
	@AfterClass
	public void tearDown(){
		
	}
}
