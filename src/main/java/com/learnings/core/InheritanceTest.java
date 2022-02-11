package com.learnings.core;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m();
		 B b= new B();
		 b.m();
		// B b=new A();
		 

	}

}
class A{
	public void m() {
		System.out.println(" A m");
	}
}

class B extends A{
	public void m() {
		System.out.println(" B m");
		
	}
}