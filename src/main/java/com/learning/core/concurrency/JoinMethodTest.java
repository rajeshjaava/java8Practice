package com.learning.core.concurrency;

public class JoinMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoin t1=new ThreadJoin("Thread t1");
		ThreadJoin t2=new ThreadJoin("Thread t2");
		ThreadJoin t3=new ThreadJoin("Thread t3");
		ThreadJoin t4=new ThreadJoin("Thread t4");
		ThreadJoin t5=new ThreadJoin("Thread t5");
		ThreadJoin t6=new ThreadJoin("Thread t6");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
			
	}

}
class ThreadJoin extends Thread{
	ThreadJoin(String name){
		super(name);
	}
	public void run() {
		System.out.println(" Thead invoked "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread execution completed : "+Thread.currentThread().getName());
	}
	
}

/*
 * output: T2 exectues only after t1 as we called join on t1, other threads can vary 
 *
 * Thead invoked Thread t1
Thread execution completed : Thread t1
 Thead invoked Thread t2
 Thead invoked Thread t3
 Thead invoked Thread t4
 Thead invoked Thread t5
 Thead invoked Thread t6
Thread execution completed : Thread t2
Thread execution completed : Thread t5
Thread execution completed : Thread t3
Thread execution completed : Thread t4
Thread execution completed : Thread t6
 */
 * 
