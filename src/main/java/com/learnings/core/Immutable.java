package com.learnings.core;

import java.util.Objects;


/*
 */
public class Immutable {
	public static void main(String args[]) {
		System.out.println("testing immutability");
		Employee e1=new Employee("rajesh",1);
		Employee e2=new Employee("rajesh",1);
		System.out.println(e1==e2);
		
	}
}
final class Employee{
	
	private final String name;
	private final Integer id;
	public Employee(String name,Integer id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
}
