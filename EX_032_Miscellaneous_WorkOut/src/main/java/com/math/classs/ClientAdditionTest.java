package com.math.classs;

public class ClientAdditionTest {

	public static void main(String[] args) {
		int addExact = Math.addExact(Integer.MIN_VALUE, 1000);
		System.out.println(addExact);
		
		//While crossing the maximum integer value, it will start to give the min value
		int add = Integer.MAX_VALUE + 1;
		System.out.println("Wrong O/p : "+addExact);
		
		//This will thorw the exception when the range crosses the limit
		int addExact2 = Math.addExact(Integer.MAX_VALUE, 1);
		System.out.println("Throw Exception : "+addExact2);

	}

}
