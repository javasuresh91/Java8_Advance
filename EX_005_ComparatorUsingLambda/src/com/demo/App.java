package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.pojo.Student;

public class App {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Suresh", 10));
		stuList.add(new Student("Su", 1));
		stuList.add(new Student("Surt", 190));
		
		Collections.sort(stuList, (one,two)->{
			return one.getName().compareTo(two.getName());
		});
		
		stuList.forEach(System.out::println);

	}

}
