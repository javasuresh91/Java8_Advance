package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * 
 * @runAsync methods has two overloaded method 
 * @First method - only Runnable implementation
 * @Second method - Runnable implementation and Executor
 *
 */
public class CompletableFuture_UsingRunAsyncMethod {

	public static void main(String[] args) {
		System.out.println("1:"+Thread.currentThread().getName());
		CompletableFuture.runAsync(()->{
			System.out.println("2:"+Thread.currentThread().getName());
			System.out.println("My task One is completed......");
		});

		System.out.println("===================");
		
		
		CompletableFuture.runAsync(()->{
			System.out.println("3:"+Thread.currentThread().getName());
			System.out.println("My task two is completed......");
		},Executors.newFixedThreadPool(2));
		
		System.out.println("4:"+Thread.currentThread().getName());
	}

}
