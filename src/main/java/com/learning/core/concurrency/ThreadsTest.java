package com.learning.core.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *  author : Rajesh Thokala
 */
public class ThreadsTest {
	public static void main(String args[]) {
		new Thread(new MyThread()).start();
		ExecutorService executor=Executors.newFixedThreadPool(15);
		Emp emp1=new Emp(1,"rajesh");
		Emp emp2=new Emp(2,"rakesh");
		Emp emp3=new Emp(3,"ramesh");
		Emp emp4=new Emp(4,"ravesh");
		Emp emp5=new Emp(5,"radesh");
		List<Emp> empList=new ArrayList<Emp>();
		empList.add(emp1);
		empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);
		Runnable t1=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("task 1");
				for(int i=0;i<20;i++) {
					empList.stream().filter(e->e.getName().equalsIgnoreCase("rajesh")).forEach(e->e.setName("Divya"));
					System.out.println(Thread.currentThread().getName());
				
					System.out.println("list values ");
					empList.stream().forEach(System.out::println);
				}
			}
			
		};
		Runnable t2=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("task 2");
				for(int i=0;i<20;i++) {
					
					//empList.stream().filter(e->e.getName().equalsIgnoreCase("rajesh")).forEach(e->e.setName("advik"));
//					try {
//						Thread.currentThread().sleep(1000);
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("list values ");
					empList.stream().forEach(System.out::println);
				}
			}
			
		};
		executor.submit(t1);
		executor.submit(t2);
		executor.shutdown();
		
	}
	

}
class Emp{
	 int id;
	 String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "id : "+id+"name : "+name;
	}
}
class MyThread implements Runnable {
	public void run() {
		System.out.println("my thread run method invoked");
		
		
	}
}
