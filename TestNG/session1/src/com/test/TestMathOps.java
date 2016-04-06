package com.test;

import org.testng.annotations.Test;

public class TestMathOps {
	
	MathOps math = new MathOps();
	
	@Test
	public void testAdditon(){
		int result = math.Addition(10, 5);
		
		if(result == 15){
			System.out.println("Addition Test Passed");			
		}else{
			System.out.println("Additon Test Failed");
		}
	}
	
	@Test
	public void testSubstraction(){
		int result = math.Substraction(10, 5);
		
		if(result==5){
			System.out.println("Substaction Test Passed");
		}else{
			System.out.println("Substaction Test Failed");
		}
	}
	
	@Test
	public void message(){
		System.out.println("Welcomce");
	}


}

