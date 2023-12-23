package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Age calculator")

public class DisableTest {

	AgeCalculator ageCalculator;
	
	@BeforeEach
	public void setUp() {
		ageCalculator  = new AgeCalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(ageCalculator!=null)
			ageCalculator = null;
	}
	
	@Test
	@Disabled
	@DisplayName("Should return valid age for +ve year")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult, aResult);
		
	}
	
	@Test
	@DisabledOnOs(value = OS.MAC)
	@DisplayName("Should return 0 age for -ve year")
	public void test2() {
		 assertEquals(0, ageCalculator.calculateAge(-1995));
	}
	
	@Test
	@DisabledOnJre(value = JRE.JAVA_21)
	@DisplayName("Should return 0 age for 0 year")
	public void test3() {
		 assertEquals(0, ageCalculator.calculateAge(0));
	}
	
	@Test
	@DisabledOnJre({JRE.JAVA_21, JRE.JAVA_19})
	@DisplayName("Should return 0 age for +ve future year")
	public void test4() {
		assertEquals(0, ageCalculator.calculateAge(2050));
	}
}
