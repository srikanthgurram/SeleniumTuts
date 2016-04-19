package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFbSignup {
/*
 * STEPS to be Automated:
 * 1. Open Firefox Browser
 * 2. Maximize the browser Window
 * 3. Open Facebook URL
 * 4. Assert Facebook login page appears
 * 5. Fill the Signup Form 
 * 
 */
	WebDriver driver;
	String baseUrl = "http://www.facebook.com";
	
	//	Step-1: Initiate Firefox Driver
	@BeforeClass
	public void initiateDriver(){
		driver = new FirefoxDriver();
		
		//maximize the window
		driver.manage().window().maximize();
	}
	
//	Step-3 & 4: Open FB url
	@Test
	public void openFb(){
		driver.get(baseUrl);
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	}
	
	//Step-5:
	@Test
	public void testSignupForm(){
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("test");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("user123");
		
		Assert.assertEquals(firstname.getAttribute("value"), "test");
		Assert.assertEquals(lastname.getAttribute("value"), "user123");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit(); 
	}
	
}
