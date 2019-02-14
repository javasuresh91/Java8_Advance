package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 
 * @The below methods are running sync, but we can have Async for all the methods
 *
 */
public class CompletableFuture_Chaining {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		System.out.println("1: "+Thread.currentThread().getName());
		/**
		 * thenCompose(),We are combining the two future and fetching the result, but the second future in the chain is depend on the first future in the chain
		 */
		CompletableFuture<String> thenCompose = CompletableFuture.supplyAsync(()->{
			System.out.println("2: "+Thread.currentThread().getName());
			 return "Hello";
		}).thenCompose(s->{
			System.out.println("3: "+Thread.currentThread().getName());
			return CompletableFuture.supplyAsync(()-> s+" world");
		});
		
		
		System.out.println("4: "+Thread.currentThread().getName() + "\n Result : "+thenCompose.get());
		
		System.out.println("==========================");
		
		/**
		 * thenCombine() , We are combining the two independent future
		 */
		CompletableFuture<String> thenCombine = CompletableFuture.supplyAsync(()->{
			System.out.println("5: "+Thread.currentThread().getName());
			 return "Hello";
		}).thenCombine(CompletableFuture.supplyAsync(()-> {
			System.out.println("6: "+Thread.currentThread().getName());
			return " world come on";
		}), (s1,s2)-> s1+s2 );
		
		System.out.println("7: "+Thread.currentThread().getName() + "\n Result : "+thenCombine.get());
		System.out.println("==========================");
		
		/**
		 * thenAcceptBoth(), it will do chain future and wont return anything, just perform action on the futures in the chain.
		 */
		CompletableFuture.supplyAsync(()->{
			System.out.println("8: "+Thread.currentThread().getName());
			 return "Hello";
		}).thenAcceptBoth(CompletableFuture.supplyAsync(()-> {
			System.out.println("9: "+Thread.currentThread().getName());
			return " world come and rock";
		}), (s1,s2)->{
			System.out.println("10: "+Thread.currentThread().getName());
			System.out.println(s1+s2);
		});
		

		
	}

}
