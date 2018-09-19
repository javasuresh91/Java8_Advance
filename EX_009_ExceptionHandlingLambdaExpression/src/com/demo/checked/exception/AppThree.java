package com.demo.checked.exception;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AppThree {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		numList.forEach(throwingConsumerWrapper(i -> {
			writeToFile(i);
		}, IOException.class));

	}

	private static <T, E extends Exception> Consumer<T> throwingConsumerWrapper(ThrowingCustomException<T, E> excep,
			Class<E> excepClass) {
		return i -> {
			try {
				excep.accept(i);
			} catch (Exception e) {
				System.out.println("Exception Exception");
			}
		};
	}

	private static Object writeToFile(Integer i) {

		return null;
	}

}
