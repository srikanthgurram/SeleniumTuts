package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathFunctions {

	MathOps math = new MathOps();
	
	@Test
	public void testMultiplication(){
		double result = math.multiplication(10.5, 5);
		Assert.assertEquals(result, 52.5);
	}
}
