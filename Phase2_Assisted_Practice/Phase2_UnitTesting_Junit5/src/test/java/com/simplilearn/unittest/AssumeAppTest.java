package com.simplilearn.unittest;


import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssumeAppTest {

	AgeCalculator calc;
	@BeforeEach
	public void setup() {
		calc=new AgeCalculator();
	}
	@AfterEach
	public void cleanup() {
		if(calc!=null)
			calc=null;
	}
	@Test
	public void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeTrue("ENV".equals(System.getProperty("DEV")));
		
	}
	@Test
	public void testOnProd() {
		System.setProperty("ENV","PROD");
		Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")),AssumeAppTest::message);
	}
	@Test
	public void testOnAllEnv() {
		System.setProperty("ENV", "DEV");
		
		assumingThat("DEV".equals(System.getProperty("ENV")), ()-> {
			Assertions.assertEquals(33, calc.calculateAge(1990));
		});

		Assertions.assertEquals(29, calc.calculateAge(1994));
		
	}
	@Test
	public void testOnQa() {
		System.setProperty("ENV","DEV");
		Assumptions.assumeFalse("QA".equals(System.getProperty("ENV")));
	}
	public static String message() {
		return "::Test assumption is failed";
	}
	
}
