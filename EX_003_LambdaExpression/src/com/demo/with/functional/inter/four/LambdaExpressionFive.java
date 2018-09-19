package com.demo.with.functional.inter.four;

public class LambdaExpressionFive {

	public static void main(String[] args) {
		int x = 30;
		int y = 14;
		doOperate(x, new MyInterface() {

			@Override
			public void operate(int n) {
				// y=10;
				System.out.println(n + y);
			}
		});

		doOperate(y, n -> {
			System.out.println(n + y);
		});

	}

	private static void doOperate(int i, MyInterface m) {
		System.out.println("Oper" + i);
		m.operate(i);
	}

}
