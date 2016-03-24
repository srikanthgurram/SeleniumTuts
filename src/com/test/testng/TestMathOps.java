package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMathOps {
	
	MathOps math = new MathOps();
	
	@BeforeTest
	public void beforeTest(){
		//Before the test
	}
	
	@AfterTest
	public void afterTest(){
		//After the test
	}
	
	@BeforeSuite
	public void beforeSuite(){
		//Before executing the TestSuite
	}
	
	@AfterSuite
	public void afterSuite(){
		//After Executing the test suite
	}
	@BeforeMethod
	public void initialize(){
		// Run before executing each test case ....
	}
	
	@AfterMethod
	public void tearDown(){
		//... Run after executing each test case
	}
	
	@Test(priority=10, enabled=false)
	public void testAdditon(){
		int result = math.addition(10, 5);
		// Assert.assertTrue(result == 14);
		// Assert.assertTrue(result == 14, "Result mismatch");		
		// Assert.assertFalse(result == 15);
		Assert.assertFalse(result != 15, "Result Matched");
	}
	
	@Test(priority=1)
	public void testSubstraction(){
		int result = math.substraction(10, 5);
		Assert.assertTrue(result == 5);
	}
	
	@Test(priority=2)
	public void message(){
		System.out.println("Welcomce");
	}


}

