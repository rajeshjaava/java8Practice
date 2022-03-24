package com.learning.core.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksDemo {
public static void main(String args[]) {
	ExecutorService executor=Executors.newFixedThreadPool(5);
	for(int i=0;i<10;i++) {
		Runnable runnable=new Worker(" "+i);
		executor.execute(runnable);
	}
	executor.shutdown();
	while(!executor.isTerminated()) {
		System.out.println("waiting threads to complete ");
	}
	
}

}
class Worker implements Runnable{
	private String name;
	public Worker(String s) {
		this.name=s;
	}
	Lock lock=new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executing the Worker thread ..!!");
		try {
			lock.lock();
			//Thread.sleep(10000);
			System.out.println("Object locked by Thread "+Thread.currentThread().getName()+" start "+name);
			lock.unlock();
			System.out.println("Object unlocked by Thread "+Thread.currentThread().getName()+" end "+name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
 
