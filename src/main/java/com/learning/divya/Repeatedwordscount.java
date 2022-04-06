package com.learning.divya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Repeatedwordscount {
	
	
	public void getrepeatedwordcount(String s1)
	{
		
		String[] str  = s1.split(" ");
		//ArrayList<String> arr = new ArrayList(Arrays.asList(str));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String e: str)

	    {
			if(map.containsKey(e))
			{
			map.put(e, map.get(e)+1);
			}
			else {
				map.put(e, 1);
			}
	    }
		for(Entry<String, Integer> m: map.entrySet())
		{
			System.out.println(m);
		}
	}
	public static void main(String args[]) {
		
		String s = "divya Rajesh Advik family ";
		Repeatedwordscount c = new Repeatedwordscount();
		//c.getrepeatedwordcount(s);
		//c.getcharcount(s);
		c.getwordscount(s);
	}
	public void getcharcount(String S1) 
	{
		
		char[] ch = S1.toCharArray();
		System.out.println(ch);
		//ArrayList<String>  arrch = new ArrayList<>(Arrays.as(ch));
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char e1 : ch)
		{
			if(map1.containsKey(e1))
			{
				
				
				map1.put(e1, map1.get(e1)+1);
				
			}
			else {
				map1.put(e1, 1);
				if(map1.get(e1)>1)
				{
					System.out.println("first repeated char is : "+e1+"");
				}
				
			}
		}
			for(Entry<Character, Integer> m1 : map1.entrySet())
			{
				
				System.out.println(m1);
				
			}
			for(char e2 : ch){
				if(map1.get(e2)>1)
				{
					System.out.println("first repeated char is : "+e2+"");
				}
			}
		
		}
	public void getwordscount(String S1)
	{
		String[] str = S1.split(" ");
		HashMap<String, Integer> map3 = new HashMap<String, Integer>();
		for(String e3 : str)
		{
			if(map3.containsKey(e3))
			{
				map3.put(e3, map3.get(e3)+1);
			}
			else {
				map3.put(e3, 1);
			}
		}
		
		
	}
		
		
	
}
