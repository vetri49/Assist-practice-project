package com.simplilearn.unittest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetirementCalculatorTest {

AgeCalculator ageCalc;
	
	@BeforeEach
	public void setUp() {
		ageCalc  = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalc!=null)
			ageCalc= null;
	}
	@Test
	@DisplayName("Should return true for +ve year")
	public void test1() {
		assertTrue(true);
		assertTrue(ageCalc.isRetired(1952));
		
	
	}
	
	

	@Test
	@DisplayName("Should return false for -ve year")
	public void test2() {
		 assertFalse(ageCalc.isRetired(-1981));
	}
	
	@Test
	@DisplayName("Should return false for 0 year")
	public void test3() {
		 assertFalse(ageCalc.isRetired(0));
	}
	
	@Test
	@DisplayName("Should return false for +ve future year")
	public void test4() {
		assertFalse(ageCalc.isRetired(2030));
	}
	
}