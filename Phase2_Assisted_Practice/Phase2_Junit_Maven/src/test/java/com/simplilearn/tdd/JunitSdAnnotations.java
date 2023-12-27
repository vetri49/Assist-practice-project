package com.simplilearn.tdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitSdAnnotations {
	@BeforeEach
	public void setUp() {
		System.out.println("--Before each is executed--");
	}
	@AfterEach
	public void cleanUp() {
		System.out.println("--After each is executed--");
	}
	@BeforeAll
	public static void setUpAll() {
		System.out.println("--Before each is executed--");
	}
	@AfterAll
	public static void cleanUpAll() {
		System.out.println("--After each is executed--");
	}
	@Test
	@DisplayName("TEST ONE")
	public void testOne() {
		System.out.println("--test one is executed--");
	}
	@Test
	@DisplayName("TEST Two")
	public void testTwo() {
		System.out.println("--test two is executed--");
	}	
	@Test
	@DisplayName("TEST Three")
	public void testThree() {
		System.out.println("--test three is executed--");
	}
	

}
