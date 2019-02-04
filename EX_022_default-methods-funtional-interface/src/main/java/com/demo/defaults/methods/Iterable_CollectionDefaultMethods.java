package com.demo.defaults.methods;

import java.util.ArrayList;
import java.util.List;

import com.demo.dto.Employee;

public class Iterable_CollectionDefaultMethods {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("john will", 20000, "CS"));
		empList.add(new Employee("sudha ", 10000, "AB"));
		empList.add(new Employee("eruma madu", 30000, "XX"));
		empList.add(new Employee("jellsi shan", 10000, "CS"));
		
		/**
		 * @forEach() is default Method.
		 * @removeIf() is a default method.
		 */
		empList.forEach(s->System.out.println(s));
		System.out.println("=====================");
		 
		empList.removeIf(s->s.getSalary()<20000);
		System.out.println(empList);

	}

}
