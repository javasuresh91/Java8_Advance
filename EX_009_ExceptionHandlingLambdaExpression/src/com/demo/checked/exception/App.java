package com.demo.checked.exception;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 6, 0, 90, 54, 23, 0);
		numList.forEach(i -> {
			try {
				writeToFile(i);
			} catch (IOException e) {
				System.out.println("Exception Exception");
				throw new RuntimeException();
			}
		});

	}

	private static Object writeToFile(Integer i) throws IOException {

		return null;
	}

}
