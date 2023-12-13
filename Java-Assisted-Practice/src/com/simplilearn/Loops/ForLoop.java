package com.simplilearn.Loops;

//Number of iterations are depends upon the condition.
// we can increment/decrement the value based on our requirements

public class ForLoop {

	public static void main(String[] args) {
		
		//Fibonacci series
		int n=10;
		int a=0,b=1,c;
		System.out.println("Fibonacci series:");
		
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
