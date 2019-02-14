package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class CompletableFuture_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		String name = null;
		CompletableFuture<String> handle = CompletableFuture.supplyAsync(() -> {
			if (name == null) {
				throw new RuntimeException("Exception occured for test");
			}
			return name;
		}).handle((s, t) -> s != null ? s : "Name not found");

		System.out.println(handle.get());
		System.out.println("===============================");

		String name2 = "suresh";
		CompletableFuture<String> handle2 = CompletableFuture.supplyAsync(() -> {
			if (name2 == null) {
				throw new RuntimeException("Exception occured for test");
			}
			return name2;
		}).handle((s, t) -> s != null ? s : "Name not found");

		System.out.println(handle2.get());

		System.out.println("===============================");

		String name3 = null;
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
			if (name3 == null) {
				System.out.println("Haiiiiiiiiiiiiiiiiiiiiiiii :"+Thread.currentThread().getName());
				throw new RuntimeException("Exception occured for test");
			}
			return name3;
		},Executors.newCachedThreadPool()); 

		try {
			System.out.println(supplyAsync.get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured :"+e);
		}

	}

}
