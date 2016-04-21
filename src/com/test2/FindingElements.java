package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindingElements {
	
	/*
	 *  Extracting More than one object from a page
 		Extracting all links of a page/Bulk extraction of objects
 		isDisplayed function
 		Finding whether object is present on page or not
	 */
	
	//class variables
	WebDriver driver;
	String baseUrl="https://github.com/";
	
	@BeforeClass
	public void initiateDriver(){
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		// Maximize browser window	
		driver.manage().window().maximize();
	}
	
	@Test
	public void testVerifyObject(){
		/*
		 * Test steps: 
		 * 	1. Go to Github site
		 * 	2. Go to Communities section
		 *  3. Look for the section called 'Join Communities'
		 */
		boolean textFound = false;
		
		driver.findElement(By.linkText("Communities")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/open-source");
		
		//Extracting More than one object from a page
		List <WebElement> all_h2s = driver.findElements(By.tagName("h2"));
		
		//Finding whether object is present on page or not
		for(int i=0; i< all_h2s.size();i++){
			
			WebElement h2 = all_h2s.get(i);
			
			if (h2.getText().equals("Join the community")){
				textFound=true;
				break;
			}else{
				textFound=false;
			}
		}
		//Assert test is passed or failed
		Assert.assertTrue(textFound);	
	}
}

