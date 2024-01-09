package com.simpilearn.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void passedTest()
	{
		System.out.println("--Test passed--");
	}
	@Test
	public void failedTest() {
		System.out.println("--Test failed--");
		fail();
	}
}
