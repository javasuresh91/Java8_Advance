/**
 * 
 */
package com.demo;

import java.util.Collections;
import java.util.List;

import com.demo.pojo.Student;

/**
 * @author Sravikumar
 *
 */
public class MyInterfaceImpl implements MyInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.MyInterface#getMaxNum(java.util.List)
	 */
	@Override
	public Integer getMaxNum(List<Integer> num) {
		Integer min = Collections.min(num);
		return min;
	}
	
	
	
	

}
