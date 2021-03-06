/**
 * 
 */
package com.demo;

import java.util.Collections;
import java.util.List;

import com.demo.pojo.Student;

/**
 * If a class is implementing two interface having same signature default
 * method, we need to overwrite atleast one interface method
 */
public class MyInterfaceImplTwo implements MyInterface, MyInterfaceTwo {

	@Override
	public Integer getMaxNum(List<Integer> num) {
		Integer min = Collections.min(num);
		return min;
	}

	@Override
	public List<Student> sortStudent(List<Student> stu) {
		// TODO Auto-generated method stub
		return MyInterface.super.sortStudent(stu);
		// return MyInterfaceTwo.super.sortStudent(stu);
	}

}
