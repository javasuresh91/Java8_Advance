package com.completable.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFuture_UsingCancelMethod {

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
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
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
				completableFuture.complete(join);
				/**
				 * @This cancel operation ensure the completableFuture object is completed properly.
				 * @If the operation not completed, then cancel method will throw CancelException
				 */
				completableFuture.cancel(true);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		});
		return completableFuture;
				
		
	}

}
