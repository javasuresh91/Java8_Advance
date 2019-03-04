package com.thread.local;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocal_04 implements Runnable{
	
	private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
		
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Simple Date Format: "+Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}
	};

	@Override
	public void run() {
		System.out.println("Thread Run Execution statred for "+Thread.currentThread().getName()	);
		System.out.println(Thread.currentThread().getName()+" Date Format : " +dateFormat.get().toPattern());
		System.out.println(Thread.currentThread().getName()+" Formatted Date :"+dateFormat.get().format(new Date()));
	}
}
