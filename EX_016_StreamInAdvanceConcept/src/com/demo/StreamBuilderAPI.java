package com.demo;

import java.util.stream.Stream;

public class StreamBuilderAPI {

	public static void main(String[] args) {
		/**
		 * @If you didn't mention the generic type in 'Stream.builder()', if will take
		 *     as Stream Of Object
		 * @We can add any type of object
		 */
		Stream<Object> streamBuildObject = Stream.builder().add("S").add("U").add("R").add("E").add(12.30).add(12)
				.add(null).build();
		streamBuildObject.forEach(System.out::print);

		System.out.println("\n==================================");
		/**
		 * @If you mention the String type it will add/build only the string type
		 */
		Stream<String> streamBuildString = Stream.<String>builder().add("S").add("U").add("R").add("E").build();
		streamBuildString.forEach(System.out::print);

	}

}
