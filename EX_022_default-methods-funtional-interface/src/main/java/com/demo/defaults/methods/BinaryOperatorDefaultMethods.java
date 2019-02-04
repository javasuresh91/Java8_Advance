package com.demo.defaults.methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.demo.dto.Employee;

public class BinaryOperatorDefaultMethods {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("A", 20000, "CS"));
		empList.add(new Employee("B", 10000, "AB"));
		empList.add(new Employee("C", 30000, "XX"));
		
		empList.add(new Employee("Z", 10000, "CS"));
		empList.add(new Employee("D", 60000, "CS"));
		empList.add(new Employee("G", 6000, "AB"));
		empList.add(new Employee("F", 4000, "XX"));
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
		
		Map<String, Optional<Employee>> maxSalByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.reducing(BinaryOperator.maxBy(comparing))));
		System.out.println(maxSalByDept);
		

	}

}
