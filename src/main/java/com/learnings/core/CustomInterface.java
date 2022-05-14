package com.learnings.core;

@FunctionalInterface
public interface CustomInterface {
	
	default void test() {
		System.out.println("default method");
	}
	
	
	public abstract int sum(int x,int y);
	

}
