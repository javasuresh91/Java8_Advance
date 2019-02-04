package com.demo.defaults.methods;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDefaultMethods {

	public static void main(String[] args) {

		BiFunction<String, Integer, Integer> salarycal = (design, age) -> {

			if (design.equalsIgnoreCase("manager") && age >= 30) {
				return 12000;
			} else if (design.equalsIgnoreCase("manager") && age < 30) {
				return 10000;
			} else if (!design.equalsIgnoreCase("manager") && age >= 30) {
				return 8000;
			} else {
				return 5000;
			}
		};

		// Normal Call/usage by BiFunction
		System.out.println(salarycal.apply("manager", 25));
		System.out.println(salarycal.apply("manager", 30));
		System.out.println(salarycal.apply("empl", 25));

		System.out.println("===========================");
		Function<Integer, String> band = sal -> {
			if (sal > 10000)
				return "GRADE A";
			else
				return "GRADE B";

		};
		// andThen of BiFunction
		/**
		 * @1. Function will be input of andThen() and it will execute after the
		 * bifunction @2. The result/return value will be the input of the Function
		 */
		String grade = salarycal.andThen(band).apply("Empl", 31);
		System.out.println(grade);

	}

}
