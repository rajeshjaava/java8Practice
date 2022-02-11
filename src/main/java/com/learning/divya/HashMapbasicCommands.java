package com.learning.divya;

import java.util.HashMap;
import java.util.Map;

public class HashMapbasicCommands {
	
	public static void main(String args[]) 
	{
		
	
	Map<String, String>  map3 = new HashMap<String, String>();
	map3.put("A", "1");
	map3.put("B", "2");
	map3.put("C", null);
	
	System.out.println(map3);
	
	Map  map4 = new HashMap<String, String>();
	map4.put("A", "1");
	map4.put("B", "2");
	map4.put("C", "3");
	
	
	HashMap map5 = new HashMap<String, String>();
	map5.putAll(map4);
	System.out.println(map5);
	
	map4.put("D", "5");
	System.out.println(map4);
	}
}
