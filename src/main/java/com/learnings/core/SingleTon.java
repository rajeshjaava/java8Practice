package com.learnings.core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTon {
	public static void main (String args[]) {
		Person p=Person.getObject();
		p.setId(10);
		p.setName("Rajesh");
		System.out.println(p);
		List<Person> listObj=new ArrayList<Person>();
		
		ExecutorService executor=Executors.newFixedThreadPool(20);
		for(int i=0;i<20;i++) {
			executor.execute(new Runnable() {
				public void run(){
					System.out.println("Executing run method..."+Thread.currentThread());
					Person p=Person.getObject();
					System.out.println(p);
					if(!listObj.contains(p)) {
						System.out.println("added object to list");
						listObj.add(p);
					}
				}
			});
			
		}
		executor.shutdown();
		System.out.println("size of the list is "+listObj.size());
		//only one object will be there in list
	}

}
class Person implements Cloneable{
	
	// make constructor as private 
	private Person() {
		System.out.println("person singleton class ");
	}
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//instance variable 
	private static Person obj;
	//global access pointer to invoke
	public static synchronized Person getObject() {
		if(null==obj) {
			obj=new Person();
		}
		return obj;
	}
	//override clone method to not allow cloning
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
