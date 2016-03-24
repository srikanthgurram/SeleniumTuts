package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMathOps {
	
	MathOps math = new MathOps();
	
	@BeforeMethod
	public void initialize(){
		System.out.println("Before Executing Test case ....");
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println("... After test case execution");
	}
	
	@Test
	public void testAdditon(){
		System.out.println("Addition test case");
		int result = math.addition(10, 5);
//		Assert.assertTrue(result == 14);
//		Assert.assertTrue(result == 14, "Result mismatch");
		
//		Assert.assertFalse(result == 15);
		Assert.assertFalse(result != 15, "Result Matched");
	}
	
	@Test
	public void testSubstraction(){
		System.out.println("Substraction test case");

		int result = math.substraction(10, 5);
		Assert.assertTrue(result == 5);
	}
	
	@Test
	public void message(){
		System.out.println("Welcomce");
	}


}

