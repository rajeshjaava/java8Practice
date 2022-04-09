package com.learning.divya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCharacterTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	// add to list 
		// check each character with instance of 
		List l=new ArrayList();
		l.add("rajesh");
		l.add(2);
		l.add("divya");
		long count=l.stream().filter(a->a instanceof String).count();
		System.out.println("count of Strings "+count);
		long count1=l.stream().filter(a->a instanceof Integer).count();
		System.out.println("count of Integers  "+count1);
		long count2=l.stream().filter(a->a instanceof Long).count();
		System.out.println("count of Long  "+count2);
		
		
		String s="a   bc12$?-^";
		List l1=new ArrayList();
		char[]c=s.toCharArray();
		for(Character c1:c) {
			l1.add(c1);
		}
		
		System.out.println("========= string array cound type of characters============");
		l1.stream().forEach(System.out::print);
		System.out.println();
		System.out.println("l1 list size"+l1.size());
		System.out.println("digits "+l1.stream().filter(a->Character.isDigit((char) a)).count());
		System.out.println("alphabet "+l1.stream().filter(a-> Character.isAlphabetic((char) a)).count());
		
	
		System.out.println("special characters count  "+l1.stream().filter(a-> !Character.isLetterOrDigit((char) a)).filter(a-> !Character. isSpace((char) a)).count());
		
	}

}














