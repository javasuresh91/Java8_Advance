package com.compartor.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * Using comparing method(with overloaded) example
 * @author admin
 *
 */
public class CompartorTest_03 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("zerts", 65));
		empList.add(new Employee("Zatyu", 15));
		empList.add(new Employee("loeey", 30));
		
		System.out.println("\nBefore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		/**
		 * @Defining the Sorting functionality using the comparing(..) method.
		 * @passing the comparing instance to the Collections.sort() method
		 */
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		Collections.sort(empList, comparing);
		
		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		System.out.println("=========================");
		
		/**
		 * This also allows the mention the key for the sorting
		 */
		Comparator<Employee> comparing2 = Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList, comparing2);
		empList.stream().forEach(System.out::println);

	}

}
