package com.learning.divya;


public class OOPSconcepts extends Extractdigit{
	int b=80;

	public static int a=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "AdvikMourya";
		OOPSconcepts probj = new OOPSconcepts();
		Extractdigit chobj = new OOPSconcepts();
		System.out.println("value is "+a);
		probj.test();
		chobj.test();
		
	}
	public void test() {
		System.out.println(this.b);
		System.out.println(super.b);
	}

}
class Extractdigit{
	static int a=20;
	int b=70;
	public void test() {
		System.out.println("parent value "+this.b);
	}
}
