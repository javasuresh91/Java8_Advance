package com.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamArrayAPI {

	public static void main(String[] args) {
		Collection<String> collections = Arrays.asList("a", "b", "c");
		Stream<String> stream = collections.stream();
		stream.forEach(System.out::println);

		System.out.println("========================");

		String[] a = { "a", "b", "c" };
		Stream<String> stream2 = Arrays.stream(a);
		stream2.forEach(System.out::println);

		System.out.println("========================");

		Stream<String> stream3 = Arrays.stream(a, 1, 3);
		stream3.forEach(System.out::println);

		System.out.println("========================");

		Stream<String> of = Stream.of("a", "b", "c");
		of.forEach(System.out::println);

	}

}
