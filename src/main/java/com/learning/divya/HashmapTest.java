package com.learning.divya;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Rajesh", "husband");
		map1.put("Divya", "wife");
		map1.put("Advik", "son");
		map1.put("1", "1");
		System.out.println(map1.get("Rajesh"));
		
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Sunday", 01);
		map2.put("Monday", 02);
		map2.put("Sunday", null);
		map2.put("Friday", null);

		System.out.println(map1.get("Friday"));
		
		map2.remove("Friday");
		
		////iterator on keys and retrieve values
		Iterator<String> i1=map1.keySet().iterator();
		while(i1.hasNext())
		{
		String key = i1.next();	
		String value = map1.get(key);
		System.out.println(key +"="+  value);
		}
		
		
		//////iterator entry set
		System.out.println("iterator entry set");
		Iterator<Entry<String, Integer>> i2= map2.entrySet().iterator();
		while(i2.hasNext()) {
		Entry<String, Integer> e=(Map.Entry)i2.next();
		System.out.println(e);
		}
		
		/////for each on keySet and Entry Set
		System.out.println("for each on keySet and Entry Set");
		for(String s: map1.keySet())
		{
			System.out.println(" key is: " + s + " value is: " +map1.get(s));
			
		}
		for(Entry<String,String> e1 : map1.entrySet() ) {
			System.out.println(e1);
		}
		for(Map.Entry e2: map1.entrySet())
		{
			System.out.println(e2);
			
				}
//////Store hashmap in list
		System.out.println("Hashmap in list");
	List<String> l1 = new ArrayList(map2.keySet());
	List<Integer> l2 = new ArrayList(map2.values());
	for(String s1: l1) {
		System.out.println(s1);
	}
	for(Integer s2: l2) {
		System.out.println(s2);
	}
	
	
	map2.put("tuesday", 03);
	System.out.println("String immutability ");
	String s1="rajesh";
	String s2="ravi";
	s1=s1+s2;
	System.out.println(s1);
	
	}
	
	
	
	

}
