package com.demo.with.functional.inter.one;

public class LambdaExpressionTwo {

	public static void main(String[] args) {

		MyInterface m1 = new MyInterface() {

			@Override
			public void methodOne() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Without Lambda : " + i);
				}

			}
		};
		m1.methodOne();

		MyInterface m2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("With Lambda : " + i);
			}
		};

		m2.methodOne();

	}

}
