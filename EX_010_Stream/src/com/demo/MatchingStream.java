package com.demo;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Student;

public class MatchingStream {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("xxxx", 10));
		list.add(new Student("xx", 910));
		list.add(new Student("qwer", 670));

		list.add(new Student("oii", 180));
		list.add(new Student("surej", 1));

		list.forEach(System.out::println);
		System.out.println("---------------------------");
		boolean allMatchFlag = list.stream().allMatch(s -> {
			return s.getName().contains("x");
		});
		System.out.println("Using All MAtch Features : " + allMatchFlag);
		;
		System.out.println("---------------------------");
		boolean anyMatchFlag = list.stream().anyMatch(s -> s.getAge() > 500);
		System.out.println("Using Any MAtch Features : " + anyMatchFlag);
		;
		System.out.println("---------------------------");

		boolean nonMatchFlag = list.stream().noneMatch(s -> s.getAge() > 500);
		System.out.println("Using None MAtch Features : " + nonMatchFlag);
		;
		System.out.println("---------------------------");
	}

}
