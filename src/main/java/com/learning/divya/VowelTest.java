package com.learning.divya;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VowelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "DivyaSree";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<=s1.length()-1; i++)
		{
			
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'|| s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{ 
			if(map.containsKey(s1.charAt(i)))
			{
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
			else {
				map.put(s1.charAt(i), 1);
			}
				
			}
			else
			{
				//map.put(s1.charAt(i), 1);
				System.out.println(s1.charAt(i) + " is a consonant");
			}
		}
		for(Entry<Character, Integer> e1 : map.entrySet()) {
			System.out.println(e1);
			
		}
	}

}
