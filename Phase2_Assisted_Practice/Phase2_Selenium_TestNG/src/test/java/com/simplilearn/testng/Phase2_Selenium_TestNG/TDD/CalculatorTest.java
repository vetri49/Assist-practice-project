package com.simplilearn.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calc;
	@BeforeMethod
	public void setup(){
		calc=new Calculator();
	}
	@AfterMethod
	public void cleanup() {
		calc=null;
	}
	@Test(description="Test +ve number")
	public void testAddition() {
		int eres=100;
		int ares=calc.add(50,50);
		assertEquals(eres,ares);
		
	}
	@Test(description="Test -ve number")
	public void testAddition2() {
		int eres=0;
		int ares=calc.add(-50,-50);
		assertEquals(eres,ares);
		
	}
	@Test(description="Test +ve and -ve number")
	public void testAddition3() {
		int eres=0;
		int ares=calc.add(150,-50);
		assertEquals(eres,ares);
	}
	@Test(description="Test -ve and +ve  number")
	public void testAddition4() {
		int eres=0;
		int ares=calc.add(-50,150);
		assertEquals(eres,ares);
	}
	@Test(description="Test 0 and +ve  number")
	public void testAddition5() {
		int eres=100;
		int ares=calc.add(0,100);
		assertEquals(eres,ares);
	}
	@Test(description="Test 0 and -ve  number")
	public void testAddition6() {
		int eres=0;
		int ares=calc.add(0,-10);
		assertEquals(eres,ares);
	}
	

}
