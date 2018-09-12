package com.demo.sample.functional.inter;

@FunctionalInterface
public interface FunctionalInterfaceThree {

	int add();

	/**
	 * more than one abstract method should not present
	 */
	// int minus();

	/**
	 * it can have object class methods in the functional interface
	 */
	int hashCode();
}
