package com.demo;

/**
 * 
 * @we can perform all operation on the Long also as used in Integer as below
 * @There are Many methods apart from the below used
 *
 */
public class Integer_LongWrapper {

	public static void main(String[] args) {

		/**
		 * @First Parameter int value
		 * @Second parameter is Number format(Hexa,octal and etc) flag 
		 */
		String unsignedString = Integer.toUnsignedString(85, 2);
		System.out.println("Binary value :" + unsignedString);
		System.out.println("===================");
		String unsignedString2 = Integer.toUnsignedString(85, 16);
		System.out.println("Hexa Value : " + unsignedString);
		System.out.println("===================");
		String unsignedString3 = Integer.toUnsignedString(20);
		System.out.println("Integer To String : " + unsignedString3);
		System.out.println("===================");
		
		/**
		 * Converting Binary to decimal
		 * 
		 */
		int parseUnsignedInt = Integer.parseUnsignedInt("100100", 2);
		System.out.println("Binary to Decimal : "+parseUnsignedInt);
		
		System.out.println("===================");
		
		/**
		 * Divide
		 */
		int divideUnsigned = Integer.divideUnsigned(100, 3);
		System.out.println("Divide : "+divideUnsigned);
		System.out.println("===================");
		/**
		 * Remainder
		 */
		int remainderUnsigned = Integer.remainderUnsigned(100, 3);
		System.out.println("Remainder : "+remainderUnsigned);
		
		
		
	}

}
