package com.demo.sample.functional.inter;

@FunctionalInterface
public interface FunctionalInterfaceTwo {

	int add();

	/**
	 * it can have object class methods in the functional interface
	 */
	boolean equals(Object obj);

}
