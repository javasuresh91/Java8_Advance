package com.demo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @Code Refactor is done on StreamReferencingAPI.java using Collectors class
 *
 */
public class StreamReferencingAPI2 {

	public static void main(String[] args) {

		/**
		 * @We can use Collectors and get as Collection Object from the Stream Object
		 */

		List<String> filter = Stream.of("A", "B", "C", "CBI").filter(e -> e.contains("B")).collect(Collectors.toList());

		/**
		 * @here We can convert the Collection Object into Stream and We can do our
		 *       Operation
		 */
		Optional<String> findAny = filter.stream().findAny();

		String string = findAny.get();

		System.out.println(string);

		System.out.println("=========================");
		/**
		 * @Again we can use same Collection Object and convert as a Stream and do
		 *        another operation on it
		 */
		Optional<String> findFirst = filter.stream().findFirst();
		System.out.println(findFirst.get());

	}

}
