package com.test2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailApp {
	/* STEP - 1: open gmail in Firefox & validate the page
	 * STEP - 2: Click on 'Create Account'
	 * STEP - 3: Check if Signup page is opened
	 * STEP - 4: Fill 'first name' 
	 * fill other input fields as excersize... 
	 */
	WebDriver driver;
	
	@BeforeClass
	public void initateDriver(){
		driver = new FirefoxDriver();
	}
	// STEP-1	
	@Test(priority=0)
	public void launchGmail(){
		driver.get("http://www.gmail.com");
		//		validate using page title
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}
	
//	Step - 2
	@Test(priority=1)
	public void openSignupPage() throws InterruptedException {
//		click on 'create account' link
		WebElement signupLink = driver.findElement(By.linkText("Create account"));
		signupLink.click();

//		 Read the Heading " Create your Google Account "
		WebElement headerText = driver.findElement(By.tagName("h1"));
		Assert.assertEquals(headerText.getText(), "Create your Google Account");
		Assert.assertTrue(headerText.isDisplayed());
		Assert.assertEquals(driver.getTitle(), "Create your Google Account");
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("test1");
		Assert.assertEquals(firstName.getAttribute("value"), "test1");
	}
}