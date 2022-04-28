package com.learnings.core;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RAJESH";
		System.out.println("input string is "+s);
		System.out.println("reverse string is "+reverse(s));

	}
	public static String reverse(String input) {
		if(input==null)
			return null;
		StringBuilder sb=new StringBuilder();
		for(int i=input.length()-1;i>=0;i--) {
			sb=sb.append(input.charAt(i));
		}
		return sb.toString();
		
	}

}
