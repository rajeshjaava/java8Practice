package com.learnings.core;

public class StaticMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethods.testStatic();
		StaticMethodCalss obj=new StaticMethodCalss();
		obj.testDefault();

	}

}
interface StaticMethods{
	public static void testStatic() {
		System.out.println("static method invoked ");
		
	}
	public default void testDefault() {
		System.out.println("default method invoked");
	}
}
class StaticMethodCalss implements StaticMethods{
	public static void testStatic() {
		System.out.println("Implemented class method invoked");
	}
	
}