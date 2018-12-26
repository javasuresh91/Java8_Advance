package com.demo;

import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {

	public static void main(String[] args) {
		
		BooleanSupplier booSupp = ()->true;
		System.out.println(booSupp.getAsBoolean());
		System.out.println("=========\n");
		int x = 100;
		int y=70;
		booSupp=()->x<y;
		System.out.println(booSupp.getAsBoolean());
		System.out.println("=========\n");
		

	}

}
