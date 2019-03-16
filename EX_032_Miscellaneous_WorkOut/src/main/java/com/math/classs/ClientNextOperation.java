package com.math.classs;

public class ClientNextOperation {

	public static void main(String[] args) {
		
		
		double nextDown = Math.nextDown(Double.NaN);
		System.out.println("Nan : "+nextDown);
		
		
		double nextDown2 = Math.nextDown(Double.NEGATIVE_INFINITY);
		System.out.println("Infinity : "+nextDown2);
		
		
		double nextDown3 = Math.nextDown(0);
		System.out.println("Zero :"+nextDown3);
		
		float nextDown4 = Math.nextDown(2);
		System.out.println("Neagtive infinity :"+nextDown4);
		
		float nextDown5 = Math.nextDown(-2);
		System.out.println("Neagtive infinity :"+nextDown5);

	}

}
