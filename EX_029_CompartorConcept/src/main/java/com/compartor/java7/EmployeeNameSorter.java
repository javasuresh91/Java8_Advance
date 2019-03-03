package com.compartor.java7;

import java.util.Comparator;

import com.compartor.dto.Employee;

public class EmployeeNameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
