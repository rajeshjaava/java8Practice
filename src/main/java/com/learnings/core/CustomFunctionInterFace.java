package com.learnings.core;

import java.util.Arrays;
import java.util.HashMap;

public class CustomFunctionInterFace {
	public static void main(String args[]) {
	/*	CustomInterface f=(x,y)->x+y;
		System.out.println("sum with functionl interface "+f.sum(10, 20));
		f.test();
		*/
		String str = "big black bug bit a big black dog on his big black nose";
		String[] sarray=str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		/*
		for(String s:sarray) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
				
			}
		}
		*/
		//Arrays.asList(sarray).stream().map());
		
		
		map.forEach((k,v)->System.out.println("Key "+k+ " value  "+v));
		
	}
	
	
}

// String str = "big black bug bit a big black dog on his big black nose";