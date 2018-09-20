package com.demo.checked.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AppTwo {
	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		numList.forEach(throwingConsumerWrapper(i -> {
			writeToFile(i);
		}));

	}

	private static <T> Consumer<T> throwingConsumerWrapper(ThrowingCustomException<T, Exception> excep) {
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
