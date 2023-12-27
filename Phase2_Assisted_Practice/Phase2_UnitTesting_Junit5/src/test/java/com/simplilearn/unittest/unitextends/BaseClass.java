package com.simplilearn.unittest.unitextends;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseClass {
	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("--Base class :: @BeforeEach--");
		
	}
	@AfterEach
	public void cleanUp() throws Exception{
		System.out.println("--Base class :: @Afterach--");
		
	}
	@BeforeAll
	public static void setupclass() {
		System.out.println("--Base class :: @BeforeAll--");
		
	}
	@AfterAll
	public static void cleanupclass() {
		System.out.println("--Base class :: @AfterAll--");
		
	}
	@Test
	public void testone() {
		System.out.println("--Base class :: @Testone--");
		
	}

}
