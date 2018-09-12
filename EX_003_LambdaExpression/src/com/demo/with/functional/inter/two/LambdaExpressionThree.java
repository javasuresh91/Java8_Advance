package com.demo.with.functional.inter.two;

public class LambdaExpressionThree {

	public static void main(String[] args) {
		MyInterface m1 = new MyInterface() {

			@Override
			public void great(String name) {
				for (int i = 0; i < 5; i++) {
					System.out.println("Without Lambda taking param : " + i + name);
				}

			}
		};

		m1.great("Suresh");
		System.out.println("--------------------------");
		MyInterface m2 = s -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("With Lambda taking param : " + i + s);
			}
		};

		m2.great("xxxx");

		System.out.println("--------------------------");

		MyInterfaceWithMultipleParam m3 = (name, age) -> {
			System.out.println("My name is " + name + " and age is " + age);
		};
		m3.great("suresh", 20);
	}

}
