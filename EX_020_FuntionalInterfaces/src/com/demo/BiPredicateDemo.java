package com.demo;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (i, s) -> i > 20 && s.startsWith("o");
		System.out.println(biPredicate.test(25, "osuy"));
		System.out.println(biPredicate.test(15, "odfd"));
		System.out.println(biPredicate.test(35, "modfd"));

	}

}
