package com.simplilearn.unittest;

public interface Calculator {

	int add(int num1,int num2);
	default int multiply(int num1,int num2) {
		return num1*num2;
	}
}
