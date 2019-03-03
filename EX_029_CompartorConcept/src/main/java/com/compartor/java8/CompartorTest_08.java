package com.compartor.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * Reverse oder of the Sorting using comparator
 * @author admin
 *
 */

public class CompartorTest_08 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee("loeey", 30));
		
		System.out.println("\nBefore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		Collections.sort(empList, comparing.reversed());
		
		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		

	}

}
