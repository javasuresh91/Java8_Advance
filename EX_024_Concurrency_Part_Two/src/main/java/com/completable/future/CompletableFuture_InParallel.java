package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFuture_InParallel {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		

		System.out.println("1: "+Thread.currentThread().getName());
		
		CompletableFuture<String> supplyAsync1 = CompletableFuture.supplyAsync(()-> {
			System.out.println("2: "+Thread.currentThread().getName());
			return "India";	
		});
		CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(()-> {
			System.out.println("3: "+Thread.currentThread().getName());
			return "India";	
		});
		CompletableFuture<String> supplyAsync3 = CompletableFuture.supplyAsync(()-> {
			System.out.println("4: "+Thread.currentThread().getName());
			return "India";	
		});
		CompletableFuture<String> supplyAsync4 = CompletableFuture.supplyAsync(()-> {
			System.out.println("5: "+Thread.currentThread().getName());
			return "India";	
		});
		
		System.out.println("====================");
		System.out.println("1 : "+Thread.currentThread().getName() +" "+supplyAsync1.isDone());
		System.out.println("1 : "+Thread.currentThread().getName() +" "+supplyAsync2.isDone());
		System.out.println("1 : "+Thread.currentThread().getName() +" "+supplyAsync3.isDone());
		System.out.println("1 : "+Thread.currentThread().getName() +" "+supplyAsync4.isDone());
		System.out.println("====================");
		
		
		CompletableFuture<Void> allOf = CompletableFuture.allOf(supplyAsync1,supplyAsync2,supplyAsync3,supplyAsync4);
		System.out.println("2 : "+Thread.currentThread().getName() +" "+supplyAsync1.isDone());
		System.out.println("2 : "+Thread.currentThread().getName() +" "+supplyAsync2.isDone());
		System.out.println("2 : "+Thread.currentThread().getName() +" "+supplyAsync3.isDone());
		System.out.println("2 : "+Thread.currentThread().getName() +" "+supplyAsync4.isDone());
		System.out.println("====================");
		
		System.out.println(Thread.currentThread().getName() +" "+allOf.get());
		
		System.out.println("====================");
		System.out.println("3 : "+Thread.currentThread().getName() +" "+supplyAsync1.isDone());
		System.out.println("3 : "+Thread.currentThread().getName() +" "+supplyAsync2.isDone());
		System.out.println("3 : "+Thread.currentThread().getName() +" "+supplyAsync3.isDone());
		System.out.println("3 : "+Thread.currentThread().getName() +" "+supplyAsync4.isDone());
		
		/**
		 * To combine all future
		 */
		
		System.out.println("====================");
		String collect = Stream.of(supplyAsync1,supplyAsync2,supplyAsync3,supplyAsync4).map(CompletableFuture::join).collect(Collectors.joining(" "));
		System.out.println(collect);
	}

}
