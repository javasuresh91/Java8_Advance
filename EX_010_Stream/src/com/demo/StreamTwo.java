package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @Stream Using Intermediate and terminate methods TO PROCESS the Stream Object
 * @Intermediate - Methods which return the Stream<T>
 * @Terminate - Method which return the end result in any types like Integer,
 *            long and etc
 *
 */
public class StreamTwo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("xxxx");
		list.add("yyyyy");
		list.add("zzzzz");
		list.add("uuuuu");
		list.add("aaaaa");
		list.add("yyyyy");

		/**
		 * Intermediate Methods is Stream
		 */
		Stream<String> streamList = list.stream();
		Stream<String> distinctStream = streamList.distinct();
		/**
		 * Terminate Methods in Stream
		 */
		long distinctCount = distinctStream.count();
		System.out.println(distinctCount);

		/**
		 * Chaining Operation
		 */
		long count = list.stream().distinct().count();
		System.out.println(count);

		/**
		 * Only once the Stream can consume, it will throw error
		 */
		long a = streamList.count();
		long b = distinctStream.count();

	}

}
