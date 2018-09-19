package com.demo.unchecked.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AppTwo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		numList.forEach(lambdaWrapper(i -> {
			System.out.println(50 / i);
		}));
	}

	/**
	 * @By using exeception like this we can keep our lambda very small(above)
	 * @It is too big and not too generic, it can be overcome in AppThree.java
	 * @param con
	 * @return
	 */
	private static Consumer<Integer> lambdaWrapper(Consumer<Integer> con) {
		return i -> {
			try {
				con.accept(i);
			} catch (Exception e) {
				System.out.println("Exception Occurred");
			}
		};
	}

}
