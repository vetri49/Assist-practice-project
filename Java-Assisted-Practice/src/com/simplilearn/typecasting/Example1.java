package com.simplilearn.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO ::/ WAP for converting int,byte,short -> float,double,long
		
		int int_num=10;
		byte byte_num=20;
		short short_num=30;
		 
		float float_num=int_num; //Implicit TypeCasting float => int
		double double_num=int_num;//Implicit TypeCasting double => int
		long long_num=int_num;//Implicit TypeCasting long => int
		System.out.println(float_num);
		System.out.println(double_num);
		System.out.println(long_num);
		System.out.println("--------------------");
		
		
		float_num=byte_num;   //Implicit TypeCasting float => byte
		double_num=byte_num;  //Implicit TypeCasting double => byte
		long_num=byte_num;    //Implicit TypeCasting long => byte
		System.out.println(float_num);
		System.out.println(double_num);
		System.out.println(long_num);
		System.out.println("--------------------");
		
		
		float_num=short_num;   //Implicit TypeCasting float => short
		long_num=short_num;    //Implicit TypeCasting long => short
		double_num=short_num;  //Implicit TypeCasting double => short
		System.out.println(float_num);
		System.out.println(double_num);
		System.out.println(long_num);
		System.out.println("--------------------");
		
       
	}

}
