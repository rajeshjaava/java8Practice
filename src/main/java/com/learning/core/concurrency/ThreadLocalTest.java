package com.learning.core.concurrency;

//Java code illustrating initialValue() method
import java.lang.*;

public class ThreadLocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread t1 = new NewThread("quiz1");
		NewThread t2 = new NewThread("quiz2");
		NewThread t3 = new NewThread("quiz3");
		NewThread t4 = new NewThread("quiz3");
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
