package com.compartor.java7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.compartor.dto.Employee;

public class CompartorTestOne {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Suresh", 27));
		empList.add(new Employee("Azxert", 03));
		empList.add(new Employee("zerts", 65));
		empList.add(new Employee("zatyu", 15));
		empList.add(new Employee("loeey", 30));
		
		System.out.println("===================WAY ONE==========================");
		/**
		 * Way 1 - Implemented Class
		 */
		System.out.println("\nBEfore Sorting:::::::::::::");
		for(Employee e : empList) {
			System.out.println(e.toString());
		}
		
		Collections.sort(empList, new EmployeeNameSorter());
		
		System.out.println("\nAfter Sorting:::::::::::::");
		for(Employee e : empList) {
			System.out.println(e.toString());
		}
		
		
		System.out.println("\n===================WAY TWO==========================");
		/**
		 * Way 2 - Anonymous Class
		 */
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getAge()>o2.getAge())
					return 1;
				else if(o1.getAge()<o2.getAge())
					return -1;
				else 
					return 0;
			}
		});
		
		System.out.println("\nAfter Sorting Second Way:::::::::::::");
		for(Employee e : empList) {
			System.out.println(e.toString());
		}
		

	}

}
