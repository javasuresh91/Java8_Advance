package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


/**
 * 
 * @The below methods are running sync, but we can have Async for all the methods
 *
 */
public class CompletableFuture_ProcessingResult {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("1: "+Thread.currentThread().getName());
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(()->{
			System.out.println("2: "+Thread.currentThread().getName());	
			return "Hello";
			
		});
		
		/**
		 * Using thenApply() by returning some/any value
		 */
		CompletableFuture<String> thenApply = supplyAsync.thenApply(s->{
			System.out.println("3: "+Thread.currentThread().getName());
			return s+" World";
			
		});
		System.out.println(thenApply.get());
		
		System.out.println("===================");
		
		/**
		 * using thenAccept() will not return anything
		 */
		
		supplyAsync.thenAccept(s->{
			System.out.println("4: "+Thread.currentThread().getName());
			System.out.println(s+" Come on");
		});
		
		System.out.println("===================");
		
		/**
		 * using thenRun() will do some operation and not return anything, but at the end of the chain we can return the value
		 */
		
		supplyAsync.thenRun(()->{
			System.out.println("5: "+Thread.currentThread().getName());
			System.out.println(" Come on");
		});
		String string = supplyAsync.get();
		System.out.println(string);
		
		

	}

}
