package com.math.classs;

public class ClientMultipleTest {

	public static void main(String[] args) {
		 int multiplyExact = Math.multiplyExact(10, 10);
		 System.out.println("Multiple : "+multiplyExact);
		 
		 
		 int multiple = Integer.MAX_VALUE* 2;
		 System.out.println("Wrong output : "+multiple);
		 
		 Math.multiplyExact(Integer.MAX_VALUE, 2);
		
		

	}

}
