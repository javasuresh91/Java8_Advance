package com.demo.defaults.methods;

import java.util.function.BiPredicate;

public class BiPredicateDefaultMethods {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> i1 != i2;
		BiPredicate<Integer, Integer> biPredicateTwo = (i1, i2) -> i1 > i2;

		/**
		 * @and() will return true when the all BiPredicate is true in that chain
		 * @or() will return when any one BiPredicate is true in that chain
		 * @negate() will return the negation of the BiPredicate value.
		 */
		System.out.println("Using And :" + biPredicate.and(biPredicateTwo).test(1, 2));

		System.out.println("Using OR :" + biPredicate.or(biPredicateTwo).test(1, 2));

		System.out.println("Using Negate :" + biPredicate.negate().test(1, 2));

		System.out.println(
				"Using all Default Methods: " + biPredicate.or(biPredicateTwo).and(biPredicate).negate().test(1, 2));
	}

}
