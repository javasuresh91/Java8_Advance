package com.demo;

import java.util.stream.Stream;

public class StreamEmptyAPI {

	public static void main(String[] args) {
		Stream<Object> emptyStream = Stream.empty();
		System.out.println(emptyStream);
		emptyStream.forEach(System.out::println);

	}

}
