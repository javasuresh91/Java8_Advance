package com.demo;


/**
 * @we can perform all operation on the Byte also as used in Short as below
 * @There are Many methods apart from the below used
 *
 */
public class Short_ByteWrapper {

	public static void main(String[] args) {
		int hashCode = Short.hashCode((short)23);
		System.out.println("Has Code of Short value : "+hashCode);
		
		System.out.println("======================");
		Short a= 50;
		/**
		 * Converting Short to Int
		 */
		int unsignedInt = Short.toUnsignedInt(a);
		System.out.println(unsignedInt);
		
		System.out.println("======================");

		/**
		 * Converting Short to Long
		 */
		long unsignedLong = Short.toUnsignedLong(a);
		System.out.println(unsignedLong);
	}

}
