package com.learning.divya;

import java.util.ArrayList;
import java.util.List;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="10 of 100 records";
		String[] s1=s.split("of");
		s1.toString().lastIndexOf(s);
		List<String> l = new ArrayList<String>();
		for(String e1: s1 )
		{
			System.out.println(e1);
		}
		


	}

}
