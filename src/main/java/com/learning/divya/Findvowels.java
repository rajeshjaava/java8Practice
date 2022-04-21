package com.learning.divya;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Findvowels {

	public static void main(String[] args) {
		String s1= "DivyaSree";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<=s1.length()-1; i++)
		{
			if(map.containsKey('a'|'e'|'i'|'o'|'u'))
			{
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
			else
			{
				map.put(s1.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> e1 : map.entrySet()) {
			System.out.println(e1);
			
		}
		

	}

}
