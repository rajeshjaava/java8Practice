package com.learnings.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java8HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Rajesh");
		hm.put(2, "Thokala");
		hm.get(1);
		hm.forEach((k,v)->System.out.println("Key : "+k+" value : "+v));
		System.out.println("Using entryset : ");
		for(Map.Entry<Integer, String> entry:hm.entrySet() ){
			System.out.println("Key :"+entry.getKey()+" value : "+entry.getValue());
			
			
		}
		
		

	}

}
