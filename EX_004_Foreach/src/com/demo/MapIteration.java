package com.demo;

import java.util.HashMap;
import java.util.Map;

import com.demo.pojo.Student;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<>();
		map.put(2, new Student("Suresh", 10));
		map.put(3, new Student("Su", 1));
		map.put(1, new Student("Surt", 190));
		
		map.forEach((k,v)->{
			System.out.println(k +"  "+v);
		});
	}

}
