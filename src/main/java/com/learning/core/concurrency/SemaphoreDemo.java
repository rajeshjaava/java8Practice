package com.learning.core.concurrency;
/*
 *  author : Rajesh Thokala
 */
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Semaphore s1=new Semaphore(1);
		ThreadT t1=new ThreadT("A",s1);
		ThreadT t2=new ThreadT("B",s1);
		t1.start();
		//t1.join(); to make execution in order
		t2.start();
		t1.join(); // threads may not be executes sequential , order can be any format
		t2.join();
		
	}

}
class ThreadT extends Thread{
	String name;
	Semaphore s;
	public ThreadT(String name,Semaphore s) {
		super(name);
		this.name=name;
		this.s=s;
	}
	public void run() {
		if(this.name.equals("A")) {
			System.out.println("a started");
			
			try {System.out.println("semaphore acquired");
			s.acquire();
			for(int i=0;i<5;i++) {
				System.out.println("A values "+i);
			}
			s.release();
			System.out.println("A permit released");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
			 {
				System.out.println("b started");
				
				try {System.out.println("semaphore acquired");
				s.acquire();
				for(int i=0;i<5;i++) {
					System.out.println("B values "+i);
				}
				s.release();
				System.out.println(" B permit released");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			 }
	}

}
