package com.compartor.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * @Using thenComparing method.
 * @it has overload methods which will help to perform the sorting at any level of chaining
 * @author admin
 *
 */
public class CompartorTest_05 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("zerts", 17));
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("Zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee("loeey", 30));
		empList.add(new Employee("zatyu", 03));

		System.out.println("\nBEfore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);

		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);

		Collections.sort(empList, thenComparing);

		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);

	}

}
