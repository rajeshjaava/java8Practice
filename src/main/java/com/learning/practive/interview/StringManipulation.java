package com.learning.practive.interview;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		int  minCount=manipulate(s);
	}
	public static int  manipulate(String s) {
		int count=0;
		char[] carray=s.toCharArray();
		for(Character c:carray) {
			
		}
		for (int i=0;i<s.length()-1/2;i++) {
			
			while(s.charAt(i+1)!=s.charAt(i)) {
				count++;
				//s.charAt(i+1)=
				System.out.println(count);
			}
			while(s.charAt(s.length()-1-i)!=s.length()-1) {
				count++;
				System.out.println(count);
			}
		}
		return count;
	}

}
