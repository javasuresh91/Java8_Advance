package com.compartor.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * @Using sort method in the List Interface instead of Collection.sort()
 * @Because, the sort method in the  list takes the Comparator Object directly
 * @author admin
 *
 */
public class CompartorTest_02 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee("loeey", 30));
		
		System.out.println("\nBefore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		empList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		
		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);

	}

}
