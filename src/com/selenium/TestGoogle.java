package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGoogle {
/*
 * Requirements: Automate this task on FireFox Browser
 * 
 * To Interact with Firefox Browser => FireFox driver
 * 		
 * WebDriver is an Interface, not a Class
 * 
 * STEP1: Open Google HOME page
 * STEP2: Get the Page the Title
 * STEP3: Assert the Tile is 'Google'
 * STEP4: Close the browser
 */
	
// initiate class variables
WebDriver driver;
String baseUrl = "http://www.google.com";

@BeforeClass
public void initiateDriver(){
//	FirefoxDriver driver = new FirefoxDriver();
	driver = new FirefoxDriver();
}

@Test
public void openGoogle(){
	driver.get(baseUrl);
	String title = driver.getTitle();
	
	Assert.assertEquals(title, "Google");
}

@AfterClass
public void tearDown(){
	driver.quit();
}
	
}
