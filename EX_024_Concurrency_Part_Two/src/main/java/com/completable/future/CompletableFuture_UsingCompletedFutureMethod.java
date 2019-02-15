package com.completable.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFuture_UsingCompletedFutureMethod {

	public static void main(String[] args) {
		
		CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World");
		try {
			System.out.println(completedFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		

	}

	

}
