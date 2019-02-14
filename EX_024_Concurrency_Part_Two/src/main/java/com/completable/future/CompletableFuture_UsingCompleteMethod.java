package com.completable.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFuture_UsingCompleteMethod {

	public static void main(String[] args) {
		CompletableFuture<String> calculateAsync = calculateAsync();
		try {
			String string = calculateAsync.get();
			System.out.println(string);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 

	}

	private static CompletableFuture<String> calculateAsync() {
		CompletableFuture<String> CompletableFuture = new CompletableFuture<>();
		List<String> list = new ArrayList<>();
		list.add("AK");
		list.add("KJJ");
		list.add("ALL");
		System.out.println(Thread.currentThread().getName());
		Executors.newCachedThreadPool().submit(()->{
			
			try {
				Thread.sleep(20);
				String join = String.join(",", list);
				/**
				 * @If this line executed the CompletableFuture object will return(Line No 39)
				 * @If the below line not executed the null will be return(Line.No:36) 
				 */
				CompletableFuture.complete(join); 
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		});
		return CompletableFuture;
				
		
	}

}
