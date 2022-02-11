package com.learnings.core;

public class LenearSearchArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,10,9,7,19};
		searchElement(a,9);
	}
	public static boolean searchElement(int a[] , int v) {
		boolean test=false;;
		for(int element:a) {
			if(element==v) {
				test=true;
			break;}
			}
		System.out.print(" index value of element is "+test);	
		
		return true;
	}
}
