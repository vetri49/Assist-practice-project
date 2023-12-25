package com.simplilearn.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArCalculatorParameterizedTest {

	private ArCalculator arCalc=new ArCalculator();
	@ParameterizedTest(name = "Test Division - {index} :: {0} / {1}  = {2}")
	@CsvSource(value = { "10, 2 , 5" ,  "56, 7, 8" , "7, 7, 1", "700, 70, 10"}, ignoreLeadingAndTrailingWhitespace = true)
	void testDivisionWithParameters(double dividend, double divisor , double aResult) {
		Assertions.assertEquals(aResult, arCalc.divide(dividend, divisor));
	}
}
