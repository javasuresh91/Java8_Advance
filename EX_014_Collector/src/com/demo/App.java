package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("tyt", "sss", "wee");
		List<String> convertedList = nameList.stream().map(element -> element.toUpperCase())
				.collect(Collectors.toList());
		convertedList.forEach(System.out::println);
	}

}
