package com.simplilearn.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc;
	@BeforeEach
	public void setup() {
		calc=new Calculator() {
		   @Override
			public int add(int num1,int num2) {
				return num1+num2;
			}
		};
	}
	@AfterEach
	public void cleanup() {
		calc=null;
	}
	@Test
	@DisplayName("Should test default method with +ve numbers")
	public void multiplyTest1() {
		int actualResult=calc.multiply(10,200);
		int expectedResult=2000;
		assertEquals(actualResult,expectedResult,"Multitplication of 10x20 should be 2000");
		
	}
	@Test
	@DisplayName("Should test default method with +ve numbers")
	public void multiplyTest2() {
		int actualResult=calc.multiply(0,200);
		int expectedResult=0;
		assertEquals(actualResult,expectedResult,"Multitplication of 0x20 should be 0");
		
	}
	@Test
	@DisplayName("Should test default method with 0 and -ve numbers")
	public void multiplyTest3() {
		int actualResult=calc.multiply(0,-200);
		int expectedResult=0;
		assertEquals(actualResult,expectedResult,"Multitplication of 0x-200 should be 0");
		
	}
}
