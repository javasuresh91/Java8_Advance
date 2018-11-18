package com.demo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Pipeline means, Perform the Sequence operation on the elements, It has three
 *           parts 1.Source,2.Intermediate operation and terminal operation
 * 
 * @We can use N no of intermediate methods on the Stream Object
 *     (i.e..skip().map())
 * 
 * The chain of Stream operation is called as Pipeline
 */
public class StreamPipelineAPI {

	public static void main(String[] args) {

		Stream<String> firstStream = Stream.of("abc1", "abc2", "abc3").skip(1);
		firstStream.forEach(System.out::println);
		System.out.println("===================");

		Stream<String> secondStream = Stream.of("abc1", "abc2", "abc3").skip(1).map(e -> e.toUpperCase());
		secondStream.forEach(System.out::println);
		System.out.println("===================");
		
		Stream<String> thirdStream = Stream.of("abc2", "abc1", "abc3").map(e -> e.toUpperCase()).sorted();
		thirdStream.forEach(System.out::println);
		System.out.println("===================");
		
		long list = Stream.of("abc2", "abc1", "abc3").map(e -> e.toUpperCase()).sorted().count();
		System.out.println(list);
		System.out.println("===================");

	}

}
