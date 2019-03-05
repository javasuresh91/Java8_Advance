package com.demo;

/**
 * @we can perform all operation on the Double also as used in Float as below
 * @There are Many methods apart from the below used
 *
 */
public class Float_DoubleWrapper {

	public static void main(String[] args) {
		
		boolean finite = Float.isFinite(123545545454545435435.435435435435435435435433652366f);
		System.out.println("Finding finite range : "+finite);
		
		System.out.println("===================");
		boolean finite2 = Float.isFinite(20.30f/0);
		System.out.println("Finding finite range : "+finite2);
		
		System.out.println("===================");
		
		float sum = Float.sum(2.0f, 6.0f);
		System.out.println("Sum of float value : "+sum);
		
System.out.println("===================");
		
		float min = Float.min(2.0f, 6.0f);
		System.out.println("min : "+min);
		
System.out.println("===================");
		
		float max = Float.max(2.0f, 6.0f);
		System.out.println("max : "+max);
		
		
		

	}

}
