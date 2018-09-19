package com.demo.one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticMethodReference {

	public static void main(String[] args) {

		/**
		 * ExecutorService is used to execute the file
		 */
		ExecutorService exeServ = Executors.newSingleThreadExecutor();
		Runnable command = StaticMethodReference::myRun; //Static MEthod Reference Calling
		exeServ.execute(command);

	}

	private static void myRun() {
		System.out.println("My Thread");
	}

}
