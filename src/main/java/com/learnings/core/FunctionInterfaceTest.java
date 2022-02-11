package com.learnings.core;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInter obj=(a,b)->a+b;
		System.out.println(obj.add(5, 10));

	}

}
interface FunctionalInter{
	public abstract int add(int a,int b);
}
