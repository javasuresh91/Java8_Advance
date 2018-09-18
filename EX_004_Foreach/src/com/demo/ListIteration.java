package com.demo;

import java.util.ArrayList;
import java.util.List;

import com.demo.pojo.Student;

public class ListIteration {

	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Suresh", 10));
		stuList.add(new Student("Su", 1));
		stuList.add(new Student("Surt", 190));
		
		stuList.forEach(stu -> {
			System.out.println(stu);
		});
		System.out.println("------------");
		stuList.forEach(System.out::print);
	}
	
	
	

}


