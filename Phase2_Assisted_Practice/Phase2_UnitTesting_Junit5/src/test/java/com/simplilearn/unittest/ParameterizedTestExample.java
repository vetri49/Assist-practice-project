package com.simplilearn.unittest;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {
	@ParameterizedTest(name="Test -{index} ::{0}is even")
	@ValueSource(ints= {1,4,6,8,10})
	public void testForEvenNumber(int number) {
		Assertions.assertTrue(number%2==0,"Even number");
	}
	@ParameterizedTest(name="Test -{index} ::{0}is palindrome")
	@ValueSource(strings={"fjen","malayalam","mom","12321","madam"})
	public void testForPalindrome(String str) {
		Assertions.assertTrue(isPalindrome(str));
	}
	@ParameterizedTest(name = "Test - {index} :: {0} is valid name and {1} is valid age")
	@CsvSource(value = { "Alex, 30", "Ram, 29", "Prajval, 20"}, ignoreLeadingAndTrailingWhitespace = true)
	void testWithCsvSource(String name, int age) {
		Assertions.assertNotNull(name);
		Assertions.assertTrue(age > 23);
	}
	
	public boolean isPalindrome(String word) {
		if(word==null)
			return false;
		else
			return StringUtils.reverse(word).equals(word);
	}

}
