package com.demo;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> supp = SupplierDemo::getNum;
		System.out.println(supp.get());
		System.out.println("======================\n");
		
		for (int i = 0; i < 21; i++) {
			System.out.println(supp.get());
		}

	}

	private static Integer getNum() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
