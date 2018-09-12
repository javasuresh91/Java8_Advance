package com.demo.sample.functional.inter;

/**
 * It is also functional interface because its super class has one abstract
 * method.
 */
@FunctionalInterface
public interface FunctionalInterfaceFive extends FunctionalInterfaceFour {

	/**
	 * If you add one method in it, it is not called as functional interface
	 */
	// public int mul();
}
