package com.simplilearn.typecasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO :: WAP for converting long,float,int into byte,short,double
		long long_num=100;
		float float_num=200;
		int int_num=300;
		
		byte byte_num=(byte)long_num;     // Explicit TypeCasting byte => long
		short short_num=(short)long_num;  // Explicit TypeCasting short => long
		
		double double_num=long_num;       //Implicit TypeCasting double => long
		System.out.println(byte_num);
		System.out.println(short_num);
		System.out.println(double_num);
		System.out.println("------------------------");
		
		
		byte_num=(byte)float_num;     // Explicit TypeCasting byte => float
		short_num=(short)float_num;   // Explicit TypeCasting short => float
		
		double_num=float_num;         //Implicit TypeCasting double =>  float
		System.out.println(byte_num);
		System.out.println(short_num);
		System.out.println(double_num);
		System.out.println("------------------------");
		
		
		byte_num=(byte)int_num;       // Explicit TypeCasting byte => int
		short_num=(short)int_num;     // Explicit TypeCasting byte => int
		
		double_num=int_num;           //Implicit TypeCasting double => int
		System.out.println(byte_num);
		System.out.println(short_num);
		System.out.println(double_num);
		System.out.println("------------------------");
		

	}

}
