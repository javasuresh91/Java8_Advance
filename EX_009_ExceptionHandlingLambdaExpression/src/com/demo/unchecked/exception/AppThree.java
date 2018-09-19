package com.demo.unchecked.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AppThree {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		numList.forEach(consumerWrapper(i -> {
			System.out.println(50 / i);
		}, Exception.class));
	}

	private static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> con, Class<E> clazz) {
		return i -> {
			try {
				con.accept(i);
			} catch (Exception e) {
				System.out.println("Exception Occured");
			}
		};
	}
}
