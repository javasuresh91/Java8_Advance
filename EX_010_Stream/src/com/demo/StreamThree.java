package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Iteration the collection and perform the operation on Data using STREAM
 * @Details example see in FilteringStream.java and MatchingStream.java
 */
public class StreamThree {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("xxxx");
		list.add("suresh");
		list.add("zzzzz");
		list.add("uuuuu");
		list.add("erf");
		list.add("yyyyy");
		/**
		 * Matching Operation
		 */
		boolean flagOne = list.stream().anyMatch(s -> s.equals("aaaaa"));
		System.out.println("Using Any Match :" + flagOne);
		flagOne = list.stream().anyMatch(s -> s.equals("aaa"));
		System.out.println("Using Any Match :" + flagOne);
		flagOne = list.stream().anyMatch(s -> s.contains("re"));
		System.out.println("Using Any Match :" + flagOne);
		flagOne = list.stream().anyMatch(s -> s.equals("re"));
		System.out.println("Using Any Match :" + flagOne);

		/**
		 * Filtering Operation
		 */
		Stream<String> filterList = list.stream().filter(s -> {
			return s.contains("a");
		});
		filterList.forEach(System.out::println);

	}

}
