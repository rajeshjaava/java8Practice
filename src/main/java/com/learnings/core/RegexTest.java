package com.learnings.core;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 *  author : Rajesh Thokala
 *  
 */
public class RegexTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Future<String> completableFuture = null;
		try {
			completableFuture = calculateAsync();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ... 

		String result = completableFuture.get();
		System.out.println("   "+result);
	}
	public static  Future<String> calculateAsync() throws InterruptedException {
	    CompletableFuture<String> completableFuture = new CompletableFuture<>();

	    Executors.newCachedThreadPool().submit(() -> {
	        Thread.sleep(500);
	        completableFuture.complete("Hello");
	        return null;
	    });

	    return completableFuture;
	}
}
