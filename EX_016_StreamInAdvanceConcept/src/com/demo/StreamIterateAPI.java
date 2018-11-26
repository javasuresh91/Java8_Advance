package com.demo;

import java.util.stream.Stream;

public class StreamIterateAPI {

	/**
	 * 
	 * @iterate() is a infinite Stream
	 * @it accept two parameters 1.Base Value 2.functionality
	 * @We should use limit for stop the infinite stream
	 * @Detail Usage can be see in EX_015_InfiniteStreamAPI
	 */
	public static void main(String[] args) {

		Stream<Integer> limit = Stream.iterate(40, n -> n + 2).limit(5);
		limit.forEach(System.out::println);

	}

}
