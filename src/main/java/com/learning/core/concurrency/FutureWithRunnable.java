package com.learning.core.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureWithRunnable {
	public static void main(String args[]) throws InterruptedException {
	MyRunnable runnableObj1=new MyRunnable(1000);
	MyRunnable runnableObj2=new MyRunnable(2000);
	
	//creating future task
	FutureTask<String> futureTask1=new FutureTask<String>(runnableObj1,"task1 completed");

	FutureTask<String> futureTask2=new FutureTask<String>(runnableObj2,"task2 completed");
	 ExecutorService executor = Executors.newFixedThreadPool(2);
	 executor.submit(futureTask1);
	 executor.submit(futureTask2);
	 while (true) {
         try {

             // if both future task complete
             if (futureTask1.isDone() && futureTask2.isDone()) {

                 System.out.println("Both FutureTask Complete");

                 // shut down executor service
                 executor.shutdown();
                 return;
             }

             if (!futureTask1.isDone()) {

                 // wait  for future task to complete
                 System.out.println("FutureTask1 output = "
                                    + futureTask1.get());
             }

             System.out.println("Waiting for FutureTask2 to complete");
             Thread.sleep(200);

         }
         catch (Exception e) {
             System.out.println("Exception: " + e);
         }
	 }
	}

}
class MyRunnable implements Runnable{
	private final long waitTime;
	public MyRunnable(long timeMilllis) {
		this.waitTime=timeMilllis;
	}
	public void run() {
		try {
			Thread.sleep(waitTime);
			System.out.println("Current Thread Name :"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
