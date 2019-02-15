package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * 
 * @supplyAsync methods has two overloaded method 
 * @First method - only Supplier implementation
 * @Second method - Supplier implementation and Executor
 *
 */
public class CompletableFuture_UsingSupplyAsyncMethod {

	public static void main(String[] args) {
		try {
			System.out.println("1:"+Thread.currentThread().getName());
			CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->{
				System.out.println("2:"+Thread.currentThread().getName());
				return "Hai";
			});
			
			System.out.println("===================");
			
			CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()->{
				System.out.println("3:"+Thread.currentThread().getName());
				return "Hello World";
			}, Executors.newCachedThreadPool());
			
			System.out.println("4:"+Thread.currentThread().getName());
			
			System.out.println(supplyAsync.get());
			System.out.println("===================");
			System.out.println(supplyAsync2.get());
			
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
