package com.demo;

public class ThisUsageInLambdaExpression {

	public static void main(String[] args) {
		int x = 100;

		doOperate(x, new MyInterface() {

			@Override
			public void operate(int n) {
				System.out.println(n + x);
				/**
				 * this is represent the instance of the Anonymous class
				 */
				System.out.println(this);
			}
		});
		System.out.println("-------------------");
		doOperate(x, m -> {
			System.out.println(m + x);
			/**
			 * It wont allow , because it wont allow reference of lambda my
			 * itself in the static method
			 */
			// System.out.println(this);
		});
		System.out.println("-------------------");
		new ThisUsageInLambdaExpression().process();
	}

	public void process() {
		int n = 9;
		new ThisUsageInLambdaExpression().doOperate(n, m -> {
			System.out.println(m + n);
			/**
			 * this is represent the instance of the class where this
			 * normal/instance method present
			 */
			System.out.println(this);
		});
	}

	private static void doOperate(int i, MyInterface m) {
		m.operate(i);
	}

}
