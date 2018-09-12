package com.demo.sample.functional.inter;

@FunctionalInterface
public interface FunctionalInterfaceOne {
	/**
	 * Normal method is treated as abstract method in interface internally
	 * atleast one abstract method shld be present
	 */
	int add();

}
