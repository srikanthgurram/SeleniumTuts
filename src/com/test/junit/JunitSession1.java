package com.test.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class JunitSession1 {
	
	@BeforeClass
	public static void preinitiate(){
		System.out.println("BEFORE CLASS :: Starting Class ...");
	}
	
	@AfterClass
	public static void postinitiate(){
		System.out.println("After CLASS :: End Class ...");
	}
	
	@Before
	public void initiate(){
		System.out.println("BEFORE:: Starting Test ...");
	}
	
	@After
	public void tearDown(){
		System.out.println("AFTER:: Test ended ...");
	}
	
	@Test
	public void testAddition(){
		int a = 10, b=50;
//		Assert.assertFalse("Additon Passed", (a+b!=60));
//		System.out.println("My Test ended here....");
		Assert.assertEquals(60, a+b);
	}
	
	@Test @Ignore
	public void testMethod2(){
		System.out.println("Test Method2");		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
