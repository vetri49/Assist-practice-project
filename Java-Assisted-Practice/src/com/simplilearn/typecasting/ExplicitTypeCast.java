package com.simplilearn.typecasting;

public class ExplicitTypeCast {
	// Explicit type cast : When type are not compatible, does not happen automatically conversion
		// Narrowing : Converts data of incompatible type, convert from higher range value to lower range value.
		// double => float => long => int => short => byte.
		
		// Entry point	
		public static void main(String[] args) {
			
			double accBal = 100.4545d;   // 8 byte => decimal point value
			
			long longBal = (long) accBal; // 8 byte => whole number value // Narrowing => double -> long
			
			int intBal = (int) accBal; // Narrowing => double -> int
			
			short shortBal = (short) longBal;  // Narrowing => long -> short
			
			byte byteBal = (byte) accBal; // Narrowing => double -> byte
			
			
			System.out.println("Acount Balance (double) : "+ accBal);
			System.out.println("Acount Balance (long) : "+ longBal);
			System.out.println("Acount Balance (int) : "+ intBal);
			System.out.println("Acount Balance (short) : "+ shortBal);
			System.out.println("Acount Balance (byte) : "+ byteBal);
			
		}

}
