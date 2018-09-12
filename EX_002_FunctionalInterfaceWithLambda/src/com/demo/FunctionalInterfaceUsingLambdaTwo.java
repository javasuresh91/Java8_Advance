package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceUsingLambdaTwo {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("a");
		nameList.add("b");
		nameList.add("c");

		System.out.println("Without Lambda : ");
		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});

		System.out.println("With Lambda : ");
		nameList.forEach(s -> System.out.println(s));

	}

}
