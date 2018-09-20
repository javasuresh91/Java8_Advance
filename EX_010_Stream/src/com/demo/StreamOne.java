package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Stream Creation in Multiple Ways
 * @Order of insertion is followed in the Stream Operation
 * @Stream cannot be reused multiple times(i.e Once the Stream object is used or
 *         consumed , we can't do another operation on same stream object,
 *         StreamTwo.java)
 *
 */
public class StreamOne {

	public static void main(String[] args) {

		/**
		 * To Create a Stream one way
		 */
		System.out.println("First Way");
		String[] arr = new String[] { "aa", "bb", "cc" };
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);

		/**
		 * TO create a Stream two way
		 */
		System.out.println("\nSecond Way");
		Stream<String> streamOf = Stream.of("aa", "bb", "cc");
		streamOf.forEach(System.out::println);
		/**
		 * To Create a Stream in Third Way
		 */
		System.out.println("\nThird Way");
		List<String> list = Arrays.asList("aa", "bb", "cc");
		Stream<String> streamList = list.stream();
		streamList.forEach(System.out::println);
	}
}
