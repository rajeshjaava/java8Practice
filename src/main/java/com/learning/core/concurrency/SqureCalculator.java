package com.learning.core.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SqureCalculator {
	private static ExecutorService executor=Executors.newFixedThreadPool(2);
	
	public Future<Integer> calculate(Integer input) {
		return executor.submit(()->{
			Thread.sleep(10000);
			return input*input;
		});
		
	}
	
	public static void main(String args[])  throws InterruptedException, ExecutionException {
		SqureCalculator squreCalculator=new SqureCalculator();
		Future<Integer> future1=squreCalculator.calculate(10);
		Future<Integer> future2=squreCalculator.calculate(50);
		while(!future1.isDone() && !future2.isDone()){
			System.out.println(String.format("Future1 is %s and Future2 is %s",future1.isDone()? "Done": "Not Done",future2.isDone()?"Done":"NotDone"));
			Thread.sleep(300);
		}
		Integer result1=future1.get();
		Integer result2=future2.get();
		System.out.println("result :"+ result1 +" and "+result2);
		executor.shutdown();
	}
		
		
		
	

}
