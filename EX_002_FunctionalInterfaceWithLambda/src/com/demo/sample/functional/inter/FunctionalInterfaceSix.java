package com.demo.sample.functional.inter;

/**
 * 
 * It can have N no of default,static method
 * 
 */
@FunctionalInterface
public interface FunctionalInterfaceSix {
	int add();

	default void minus() {

	}

	default int mul() {
		return 0;
	}

	static void div() {

	}

	static void per() {

	}

	int hashCode();

}
