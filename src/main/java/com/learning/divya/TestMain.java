package com.learning.divya;

public class TestMain {
	
	public static void main(String args[])
	{
		System.out.println("main method invoked");
		P p=new P();
		p.m1();
		C c =new C();
		c.m1();
		P p1=new C();
		p1.m1();
	}
	public static void main(String args[],int s)
	{
		System.out.println("main method invoked");
	}
	

}
  class TestMain1 extends TestMain {
	  
	 public static void main(String args[])
		{
			System.out.println("main1 method invoked");
		}
	

}
  


