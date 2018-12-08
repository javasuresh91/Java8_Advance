package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "x");
		map.put("2", "y");
		map.put("3", "u");
		BinaryOperator<String> binary = (s1, s2) -> s1 + "~~~" + s2;

		binarOptFunction(map, binary).forEach(System.out::println);
		;

	}

	private static List<String> binarOptFunction(Map<String, String> map, BinaryOperator<String> binary) {
		List<String> byList = new ArrayList<>();
		map.forEach((k, v) -> byList.add(binary.apply(k, v)));
		return byList;

	}

}
