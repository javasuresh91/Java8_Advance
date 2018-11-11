package com.demo;

import java.util.Arrays;
import java.util.List;

public class App {

	/**
	 * 
	 * @Reduce is used to implement different functionality/behaviour on the base
	 *         value/data
	 */
	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(1, 2, 3);
		/**
		 * @100 - Base Value 
		 * @(x,y)->x+y - Functionality
		 */
		int sum = listInt.stream().reduce(100, (x, y) -> x + y);
		System.out.println("Reduction : " + sum);

	}

}
