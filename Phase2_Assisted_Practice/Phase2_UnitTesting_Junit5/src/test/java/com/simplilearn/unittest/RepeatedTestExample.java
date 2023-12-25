package com.simplilearn.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	AgeCalculator calc;
	@BeforeEach
	public void setup() {
		calc=new AgeCalculator();
		
		
	}
	@AfterEach
	public void cleanUp() {
		if(calc!=null)
			calc=null;
	}
	@RepeatedTest(3)
	@Test
	@DisplayName("should return valid age for +ve year")
	public void test1() {
		int actualResult=calc.calculateAge(1990);
		int expectedResult=33;
		Assertions.assertEquals(expectedResult, actualResult);
	}
	@RepeatedTest( 3)
	@Test
	@DisplayName("Age Calculator")
	public void test2() {
		Assertions.assertEquals(33, calc.calculateAge(1990));
		Assertions.assertEquals(30, calc.calculateAge(1993));
	}
	@RepeatedTest( value=3,name=RepeatedTest.LONG_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate long name")
	public void test3() {
		Assertions.assertEquals(33, calc.calculateAge(1990));
		Assertions.assertEquals(30, calc.calculateAge(1993));
	}
	@RepeatedTest( value=3,name=RepeatedTest.SHORT_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate short name")
	public void test4() {
		Assertions.assertEquals(33, calc.calculateAge(1990));
		Assertions.assertEquals(30, calc.calculateAge(1993));
	}
	

}
