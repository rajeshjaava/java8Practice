package com.learning.divya;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.test();
		B b=new B();
		b.test();
		A a1=new A();
		a1.test();
		
	}

}
class A{
	public void test() {
		System.out.println("Parent ");
	}
}
class B extends A{
	public void test() {
		System.out.println("child ");
	}
}
