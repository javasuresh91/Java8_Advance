package com.demo.defaults.methods;

import java.util.ArrayList;
import java.util.List;

import com.demo.dto.Employee;

public class ListDefaultMethods {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("john will", 20000, "CS"));
		empList.add(new Employee("sudha ", 10000, "AB"));
		empList.add(new Employee("eruma madu", 30000, "XX"));
		empList.add(new Employee("jellsi shan", 10000, "CS"));

		//1.
		empList.forEach(System.out::println);

		System.out.println("===================");

		//2.
		empList.sort((e1, e2) -> {
			return e1.getSalary() > e2.getSalary() ? 1 : -1;
		});

		empList.forEach(System.out::println);

		System.out.println("===================");
		
		empList.replaceAll(emp->{
			if(emp.getSalary()>=20000)
			return emp;
			else {
				emp.setSalary(emp.getSalary()*10);
				return emp;
			}	
		});
		
		empList.forEach(System.out::println);

		System.out.println("===================");

	}

}
