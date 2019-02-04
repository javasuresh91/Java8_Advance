package com.demo.defaults.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.demo.dto.Employee;

public class FunctionDefaultMethods {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("john will", 20000, "CS"));
		empList.add(new Employee("sudha ", 10000, "AB"));
		empList.add(new Employee("eruma madu", 30000, "XX"));
		empList.add(new Employee("jellsi shan", 10000, "CS"));

		/**
		 * @compose() method we can do nested function interface call, and the
		 *            argument(function interface) of compose will execute and then it
		 *            will execute the caller function interface.
		 * @andThen() method will execute the caller function interface, and the
		 *            arguments(function interface) of andThen method.
		 * @identity() method is general type, it denotes, that return the same type as
		 *             type of input.
		 */

		usingComposeDefaultMethod(empList);
		System.out.println("=============");
		usingandThenDefaultMethod(empList);
		System.out.println("=============");
		List<String> usingIdentityDefaultMethod = usingIdentityDefaultMethod(empList,Function.identity());
		System.out.println(usingIdentityDefaultMethod);

	}
	
	public static List<String> usingIdentityDefaultMethod(List<Employee> empList,Function<String, String> empFun) {
		List<String> list = new ArrayList<>();
		empList.forEach(emp->{
			list.add(empFun.apply(emp.getDeptName()));
		});
		return list;
	}

	private static void usingandThenDefaultMethod(List<Employee> empList) {
		Function<Employee, String> empName = Employee::getName;
		Function<String, String> firstLetter = s -> s.substring(0, 1);
		List<String> firstLetters = empList.stream().map(emp -> {
			String apply = empName.andThen(firstLetter).apply(emp);
			return apply;
		}).collect(Collectors.toList());
		System.out.println(firstLetters);
	}

	private static void usingComposeDefaultMethod(List<Employee> empList) {
		// Function<Employee, String> empName = e->e.getName();
		Function<Employee, String> empName = Employee::getName;

		Function<Employee, Employee> empFirstName = e -> {
			int index = e.getName().indexOf(" ");
			e.setName(e.getName().substring(0, index));
			return e;
		};
		System.out.println(getNames(empList, empName.compose(empFirstName)));
	}

	public static List<String> getNames(List<Employee> empList, Function<Employee, String> empName) {
		List<String> names = new ArrayList<>();
		empList.forEach(emp -> {
			names.add(empName.apply(emp));
		});

		return names;
	}

}
