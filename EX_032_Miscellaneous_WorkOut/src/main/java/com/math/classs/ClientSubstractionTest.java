package com.math.classs;

public class ClientSubstractionTest {

	public static void main(String[] args) {
		 int subtractExact = Math.subtractExact(Integer.MAX_VALUE, 1000);
		 System.out.println("Sub : "+subtractExact);
		 
		 
		 int sub = Integer.MIN_VALUE- 1;
		 System.out.println("Wrong output : "+sub);
		 
		 int subtractExact2 = Math.subtractExact(Integer.MIN_VALUE, 1);
		
		

	}

}
