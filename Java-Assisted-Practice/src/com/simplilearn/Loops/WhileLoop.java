package com.simplilearn.Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i=1;
       while(i<=10) {
    	   System.out.println(i++);
    	   
       }
       System.out.println("----------------------");
       int j=9;
       boolean result=false;
       while(result==false) {
    	   System.out.println(j--);
    	   if(j==0)result=true;
       }
	}

}
