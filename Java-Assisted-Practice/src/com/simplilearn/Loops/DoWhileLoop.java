package com.simplilearn.Loops;


//It will execute the first execution ,before checking the condition.

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int count=1,i=1;
		do {
			System.out.println("count: "+count++);
			i++;
		
		}while(i<=10);
		
		System.out.println("--------------------------------------");
		
	 int revCount=5;
	 do {
		 System.out.println("Reverse count is: "+revCount--);
	 }while(revCount>=0);

	}

}
