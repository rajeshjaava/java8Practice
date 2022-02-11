package com.learnings.core;

public class User {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	int  age;
	
	public String toString() {
		return "	name  : "  +name+" 	age	: "+age;
	}
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}

}
