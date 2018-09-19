package com.demo;

public class App {

	public static void main(String[] args) {
		/**
		 * Compiler can judge the return type automatically Compiler can judge
		 * the type of the argument So it is called as TYpe inference
		 */
		MyComparator myComparator = (m1, m2) -> m1 > m2;
		System.out.println(myComparator.compare(10, 60));

	}

}
