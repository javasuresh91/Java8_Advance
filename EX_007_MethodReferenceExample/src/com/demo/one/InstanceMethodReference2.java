package com.demo.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.demo.pojo.Person;

public class InstanceMethodReference2 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("a");
		name.add("b");
		name.add("c");

		System.out.println("Using Lambda");
		name.forEach(x -> {
			System.out.println(x);
		});

		System.out.println("----------------------------");
		System.out.println("Using Object for method Reference");
		/**
		 * out is the object of the PrintStream class which has println method
		 */
		name.forEach(System.out::println);

	}

}
