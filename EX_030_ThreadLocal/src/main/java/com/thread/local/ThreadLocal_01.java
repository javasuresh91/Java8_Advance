package com.thread.local;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class ThreadLocal_01 {

	public static void main(String[] args) throws Exception {
		
		ThreadLocal<String> threadLocal = new ThreadLocal<String>();
		threadLocal.set("hai Welcome");
		String string = threadLocal.get();
		System.out.println(string);
		
		System.out.println("=========================");
		
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		CompletableFuture.runAsync(new ThreadLocal_02(), Executors.newFixedThreadPool(5));
		

	}

}
