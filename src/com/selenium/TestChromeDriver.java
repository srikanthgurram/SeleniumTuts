package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestChromeDriver {
	WebDriver driver;
	
	@BeforeClass
	public void initiateDriver(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testGoogle(){
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
