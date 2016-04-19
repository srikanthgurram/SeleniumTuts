package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

@Test
public void testSearch() throws InterruptedException{
	//Enter text in the Search Box
	WebElement searchField = driver.findElement(By.id("lst-ib"));
//	searchField.click();
	searchField.sendKeys("INDIA");
	
	//click on Search Button
	WebElement searchButton = driver.findElement(By.id("sblsbb"));
	searchButton.click();
	Thread.sleep(1000);
	//Verify the text in the search box
	Assert.assertEquals(searchField.getAttribute("value"), "INDIA");
}

@AfterClass
public void tearDown(){
//	driver.quit();
}
	
}
