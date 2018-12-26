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
		 * Empty Stream
		 */
		System.out.println("First Way");
		Stream<Object> empty = Stream.empty();
		System.out.println(empty);

		/**
		 * To Create a Stream one way
		 */
		System.out.println("\nSecond Way");
		String[] arr = new String[] { "aa", "bb", "cc" };
		Stream<String> streamFull = Arrays.stream(arr);
		Stream<String> streamPart = Arrays.stream(arr,1,3);
		streamFull.forEach(System.out::println); // Output : aa,bb,cc
		streamPart.forEach(System.out::println); // Output : bb,cc

		/**
		 * TO create a Stream two way
		 */
		System.out.println("\nThird Way");
		Stream<String> streamOf = Stream.of("aa", "bb", "cc");
		streamOf.forEach(System.out::println);
		/**
		 * To Create a Stream in Third Way
		 */
		System.out.println("\nFourth way");
		List<String> list = Arrays.asList("aa", "bb", "cc");
		Stream<String> streamList = list.stream();
		streamList.forEach(System.out::println);
	}
}
