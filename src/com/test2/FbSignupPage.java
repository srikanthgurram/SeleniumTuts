package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbSignupPage {
	
	/*
	 * Automate Facebook Signup page
	 * 
	 * Steps:
	 * #1. Open Firefox browser
	 * #2. Go to URL - Facebook.com
	 * #3. Check if Facebook Home page is launched
	 * #4. Fill all the fields in Signup Form 
	 * #5. Check the data entered in the signup form 
	 * #6. Close the browser
	 */
	FirefoxDriver driver;
	
	
//	Step1: Firefox browser
	@BeforeClass
	public void initiateDriver(){
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test(priority=0)
	public void checkFbpage(){
//		validate using title of the page
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up",pageTitle );
	}
	
	@Test(priority=2)
	public void fillSignUpForm(){
//		fill firstname
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.click();
		firstName.clear();
		firstName.sendKeys("test");
		String textEntered = firstName.getAttribute("value");
		Assert.assertEquals("test", textEntered);
		
		String lastname_id = "u_0_3";
		
		WebElement lastname = driver.findElement(By.id(lastname_id));
		lastname.sendKeys("user123");
		Assert.assertEquals("user123", lastname.getAttribute("value"));
		
		//Password
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("1qaz2wsx");
		Assert.assertEquals("1qaz2wsx", pwd.getAttribute("value"));
		
		//Radio button
		WebElement male = driver.findElement(By.id("u_0_f"));
		male.click();
		
		//Selecting Dropdown menus
		Select day = new Select(driver.findElement(By.id("day")));
//		day.selectByValue("7");
		day.selectByIndex(3);
		
	}

	@AfterClass
	public void closeBrowser(){
//		driver.quit();
	}
}
