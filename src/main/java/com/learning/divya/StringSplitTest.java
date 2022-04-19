package com.learning.divya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="10 of 100 rec 4";
		String[] s1=s.split("of");
		int n = s.lastIndexOf("of");
		
		//s1
		System.out.println(n);
		List<String> l = new ArrayList<String>();
		for(String e1: s1 )
		{
			System.out.println(e1);
		}
		String k1 = "apple orange banana kiwi";
		String[] k2 =k1.split(" ");
		//List<String> l1 = new ArrayList<>(Arrays.asList(k2));
	Arrays.sort(k2);
	
	System.out.println("sorted order is " + Arrays.toString(k2));
		
	}

}