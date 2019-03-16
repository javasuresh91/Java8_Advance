package com.math.classs;

public class ClientFloorOperation {

	public static void main(String[] args) {
		
		int floorDiv = Math.floorDiv(45, 4);
		System.out.println("Retur only the Quosent : "+floorDiv);
		
		
		//If the value is negative then it behaves differently
		int floorDiv2 = Math.floorDiv(-45, 4);
		System.out.println("Retur only the Quosent : "+floorDiv2);

	}

}
