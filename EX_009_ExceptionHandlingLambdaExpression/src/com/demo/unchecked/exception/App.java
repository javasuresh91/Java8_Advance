package com.demo.unchecked.exception;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		/**
		 * This LAmbda is become two large. to overcome this we can we
		 * AppTwo.java methodology
		 */
		numList.forEach(i -> {
			try {
				System.out.println(50 / i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Arthimetric Excpetion");
			}
		});

	}

}
