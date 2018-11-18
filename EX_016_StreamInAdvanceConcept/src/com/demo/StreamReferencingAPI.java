package com.demo;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 
 * @This Referencing is used to re use the Stream before using the Terminate
 *       methods.
 * 
 * @Below Code will Throw error on the Stream Object
 * @StreamReferencingAPI2.java overcome this Error by Referencing concept
 *
 */
public class StreamReferencingAPI {

	public static void main(String[] args) {

		Stream<String> filter = Stream.of("A", "B", "C", "CBI").filter(e -> e.contains("B"));
		/**
		 * Terminate Methods Called
		 */
		Optional<String> findAny = filter.findAny();

		String string = findAny.get();

		System.out.println(string);

		/**
		 * This will throw error as Stream is already closed or consumed
		 */
		Optional<String> findFirst = filter.findFirst();

	}

}
