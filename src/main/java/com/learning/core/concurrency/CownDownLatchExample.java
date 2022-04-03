package com.learning.core.concurrency;

import java.util.concurrent.CountDownLatch;

public class CownDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(2);
		// TODO Auto-generated method stub
		Teams t1=new Teams(latch,"Team -A");
		Teams t2=new Teams(latch,"Team -A");
		QATeam t3=new QATeam("QA Team");
		t1.start();
		t2.start();
		latch.await();
		System.out.println("completed team a and b ");
		t3.start();
		System.out.println("started QA thread "+Thread.currentThread().getName());

	}

}
class Teams extends Thread{
	CountDownLatch latch;
	public Teams(CountDownLatch latch,String name) {
		super(name);
		this.latch=latch;
	}
	public void run() {
		System.out.println("Dev Thead started  :"+Thread.currentThread().getName());
		try {
		Thread.sleep(3000);
		}catch(InterruptedException ie) {
			System.out.println("Interrupted exception "+ie);
		}
		latch.countDown();
		System.out.println("Dev Thead completed  :"+Thread.currentThread().getName());
		
	}
}
class QATeam extends Thread{
	CountDownLatch latch;
	public QATeam(String name) {
		super(name);
	
	}
	public void run() {
		System.out.println("QA Thead started  :"+Thread.currentThread().getName());
		try {
		Thread.sleep(3000);
		}catch(InterruptedException ie) {
			System.out.println("Interrupted exception "+ie);
		}
		System.out.println("QA Thead started  :"+Thread.currentThread().getName());
		
	}
}