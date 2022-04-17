package com.learning.core.concurrency;


import java.lang.*;

public class ThreadLocalTest {

	public static void main(String[] args) {
		
		NewThread t1 = new NewThread("quiz1");
		NewThread t2 = new NewThread("quiz2");
		
	}

}

class NewThread extends Thread {
	private static ThreadLocal gfg = new ThreadLocal() {
		protected Object initialValue() {
			return new Integer(question--);
		}
	};

	private static int question = 15;
	int localValue=10;
	volatile int local=5;
	NewThread(String name) {
		super(name);
		start();
	}

	public void run() {
		System.out.println("local varaible value "+localValue);
		System.out.println("volatile variable value "+local);
		System.out.println(getName() + " " + gfg.get());
		System.out.println(localValue--);
		System.out.println(local--);
	}
}
