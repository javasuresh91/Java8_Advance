package com.thread.local;

/**
 * Thread safety on ThreadLocal
 * @author admin
 *
 */
public class ThreadLocal_03 {

	public static void main(String[] args) {
		ThreadLocal_04 threadLocal_04 = new ThreadLocal_04();
		Thread thread1 = new Thread(threadLocal_04, "Thread 1");
		Thread thread2 = new Thread(threadLocal_04, "Thread 2");
		Thread thread3 = new Thread(threadLocal_04, "Thread 3");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
