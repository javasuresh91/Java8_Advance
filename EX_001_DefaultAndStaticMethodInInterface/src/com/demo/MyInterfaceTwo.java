/**
 * 
 */
package com.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.demo.pojo.Student;

/**
 * @author Sravikumar
 *
 */
public interface MyInterfaceTwo {

	/**
	 * Implementation class can overwrite it , if it required
	 * 
	 * @param stu
	 * @return
	 */
	default List<Student> sortStudent(List<Student> stu) {
		Collections.sort(stu);
		return stu;
	}
	/**
	 * Implementation class cannot overwrite it
	 * 
	 * @param name
	 */
	static public void great(String name) {
		System.out.println("Welcome : " + name);
	}

	/**
	 * Implementation class need to overwrite
	 * 
	 * @param stu
	 * @return
	 */
	public Integer getMaxNum(List<Integer> num);

}
