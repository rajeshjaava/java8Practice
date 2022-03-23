package com.learning.core.concurrency;
/*
 *  author : Rajesh Thokala
 */
public class ThreadsTest {
	public static void main(String args[]) {
		new Thread(new MyThread()).start();
		
	}

}
class MyThread implements Runnable {
	public void run() {
		System.out.println("my thread run method invoked");
		
		
	}
}
