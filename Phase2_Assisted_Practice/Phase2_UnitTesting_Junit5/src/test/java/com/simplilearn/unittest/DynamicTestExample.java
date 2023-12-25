package com.simplilearn.unittest;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {

	@TestFactory
	public DynamicTest dynamicTestWithDynamicTest() {
		return DynamicTest.dynamicTest("Addition Test",()->{
			Assertions.assertEquals(200,Math.addExact(100, 100));
		});
	}
	@TestFactory
	public Collection<DynamicTest> dynamicTestWithCollection() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test +ve", () -> {
					Assertions.assertEquals(200, Math.addExact(100, 100));
				}),
				DynamicTest.dynamicTest("Addition Test -ve and +ve", () -> {
					Assertions.assertEquals(200, Math.addExact(-200, 400));
				}),				
				DynamicTest.dynamicTest("Addition Test 0 and +ve", () -> {
					Assertions.assertEquals(400, Math.addExact(0, 400));
				}),
				DynamicTest.dynamicTest("Addition Test -ve and -ve", () -> {
					Assertions.assertEquals(-200, Math.addExact(-100, -100));
				})			
		);		
	}
	@TestFactory
	public Iterable<DynamicTest> dynamicTestWithIterable() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test", () -> {
					Assertions.assertEquals(20, Math.addExact(10, 10));
				}),
				DynamicTest.dynamicTest("Multiplication Test", () -> {
					Assertions.assertEquals(100, Math.multiplyExact(10, 10));
				})	
		);		
	}
	
	@TestFactory
	public Stream<DynamicTest> dynamicTestWithStream() {
		return IntStream.iterate(1, n -> n+5).limit(6)
				.mapToObj(n -> 
				DynamicTest.dynamicTest("Test Divisible by 2 :: " + n, () -> {
					Assertions.assertTrue(n%2 ==0);
				})
			);
	}
	
	
}
