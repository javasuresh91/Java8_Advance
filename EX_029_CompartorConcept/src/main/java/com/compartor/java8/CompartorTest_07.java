package com.compartor.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * To perform the sorting on the Null values
 * @author admin
 *
 */
public class CompartorTest_07 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(null, 17));
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("Zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee(null, 30));
		empList.add(new Employee("zatyu", 03));
		
		System.out.println("\nBefore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName, Comparator.nullsFirst(String::compareTo));
		Comparator<Employee> comparing2 = Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo));
		
		empList.sort(comparing);
		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		empList.sort(comparing2);
		System.out.println("\nAfter Sorting using null Last:::::::::::::");
		empList.stream().forEach(System.out::println);

	}

}
