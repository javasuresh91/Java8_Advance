package com.compartor.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.compartor.dto.Employee;

/**
 * 
 * @author admin
 * 
 * Using Lambda Expression
 *
 */
public class CompartorTest_01 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee("loeey", 30));
		
		
		System.out.println("\nBEfore Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		
		Collections.sort(empList,(emp1,emp2)->emp1.getName().compareTo(emp2.getName()));
		
		
		System.out.println("\nAfter Sorting:::::::::::::");
		empList.stream().forEach(System.out::println);
		
		
		
		

	}

}
