package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.pojo.Student;

public class FilteringStream {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("xxxx", 10));
		list.add(new Student("xx", 910));
		list.add(new Student("qwer", 670));

		list.add(new Student("oii", 180));
		list.add(new Student("surej", 1));

		list.forEach(System.out::println);
		Stream<Student> filterStream = list.stream().filter(s -> {
			return s.getAge() > 500;
		});

		System.out.println("\nAfter Filter :");
		filterStream.forEach(System.out::println);
	}

}
