package com.demo;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Without Lambda : " + i);
		}

	}

}
