package com.demo;

import java.util.ArrayList;
import java.util.List;

import com.demo.pojo.Student;

public class App {

	public static void main(String[] args) {

		MyInterface inter = new MyInterfaceImpl();
		List<Student> stu = new ArrayList<>();
		
		inter.sortStudent(stu);
		
		MyInterface.great("Suresh");
		
		List<Integer> num = null;
		inter.getMaxNum(num);
		
		

	}

}
