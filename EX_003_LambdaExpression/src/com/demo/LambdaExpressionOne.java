package com.demo;

public class LambdaExpressionOne {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread);

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("With Lambda : " + i);
			}
		});

		t.start();

		t2.start();
	}

}
