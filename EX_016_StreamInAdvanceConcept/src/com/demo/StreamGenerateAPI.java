package com.demo;

import java.util.stream.Stream;

public class StreamGenerateAPI {

	/**
	 * 
	 * @generate() accept type is Supplier
	 * @So we can use out own functionality or any pre-defined functionality(UUID)
	 *     as supplier
	 * @generate() is the infinite stream so, we need to give the limit of this
	 *             stream object
	 */
	public static void main(String[] args) {
		Stream<String> limit = Stream.generate(() -> {
			return "Helloo";
		}).limit(5);
		limit.forEach(System.out::println);

	}

}
