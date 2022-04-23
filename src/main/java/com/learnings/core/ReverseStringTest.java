package com.learnings.core;
/*
 *  author : Rajesh Thokala
 *  
 */
public class ReverseStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="iamrajesh";
		reverse(s);
		System.out.println("reverse with char array");
		reverseCharArray(s);
		reverseWithStringBuilder(s);
	}
	public static void reverse(String s) {
		String s1=new String();
		for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
		}
		
		System.out.println(s);
		System.out.println(s1);
	}
	
	public static void reverseCharArray(String s) {
		String s1=new String();
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
		s1=s1+c[i];
		}
		System.out.println(s1);

	}
	public static void reverseWithStringBuilder(String s) {
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		StringBuffer sbf=new StringBuffer(s);
		System.out.println(sbf.reverse());
	}

}
