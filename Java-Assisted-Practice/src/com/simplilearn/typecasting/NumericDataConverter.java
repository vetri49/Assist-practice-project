package com.simplilearn.typecasting;

public class NumericDataConverter {

	public static void main(String[] args) {
		
			        byte smallCount = 99 ;  // 1 byte => -128 to 127 
					
					short shortCount = smallCount ; // 2 byte => -32768 to 32767  // Implicit Type cast
					
					int intCount = shortCount ;     //  4 bytes => -2,147,483,648 to 2,147,483,647  // Implicit Type cast
					
					long longCount = intCount ;      // Implicit Type cast -> int => long
					
					float floatCount = longCount;    // Implicit Type cast -> long => float
					
					double decimalCount = longCount; // Implicit Type cast -> long => double
					
					double decimalCount2 = floatCount; // Implicit Type cast -> float => double
					
					System.out.println("Byte count : "+ smallCount);
					System.out.println("Integer count : "+ intCount);
					System.out.println("Short count : "+ shortCount);
					System.out.println("Long count : "+ longCount);
					System.out.println("Float count : "+ floatCount);
					System.out.println("Doube count 1 : "+ decimalCount);
					System.out.println("Double count 2 : "+ decimalCount2);

	}

}
