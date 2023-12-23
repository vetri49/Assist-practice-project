package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Age calculator")
public class AgeCalculatorTest {

	AgeCalculator ageCalc;
	
	@BeforeEach
	public void setUp() {
		ageCalc  = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalc!=null)
			ageCalc = null;
	}
	
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalc.calculateAge(1990);
		assertEquals(eResult, aResult);
	
	}
	
	@Test
	@DisplayName("Should return 0 age for -ve year")
	public void test2() {
		 assertEquals(0, ageCalc.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	public void test3() {
		 assertEquals(0, ageCalc.calculateAge(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	public void test4() {
		assertEquals(0, ageCalc.calculateAge(2050));
	}
}
