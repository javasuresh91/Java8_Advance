package com.demo.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstructorMethodReference {

	ConstructorMethodReference(String a) {
		System.out.println("Hai " + a + " it my own constructor reference");
	}

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 5, 2, 900, 4);
		System.out.println("Original Array Elements : ");
		/**
		 * Static Method reference
		 */
		num.forEach(System.out::println);
		System.out.println("------------------------------------------");
		/**
		 * @Constructor Reference always expect the Function Interface as return
		 *              type
		 * @FUnction Interface takes two parameter which denotes, the Type of
		 *           parameter of the constructor and return of constructor
		 */
		List<Double> num1 = ConstructorMethodReference.findSqrRt(num, Integer::new); // Constructor
		System.out.println("Square root of Original Array Elements using Constructor Reference: "); // Reference
		num1.forEach(System.out::println);
		System.out.println("------------------------------------------");
		/**
		 * Constructor Reference
		 */
		Function<String, ConstructorMethodReference> f = ConstructorMethodReference::new;
		f.apply("Suresh");
	}

	private static List<Double> findSqrRt(List<Integer> num, Function<Integer, Integer> f) {
		List<Double> res = new ArrayList<>();
		num.forEach(x -> {
			res.add(Math.sqrt(f.apply(x)));
		});
		return res;

	}

}
