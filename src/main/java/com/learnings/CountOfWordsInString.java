package com.learnings;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="This is rajesh learning java ok java ok";
		String[] splitLine=line.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int count=0;
		for(String word: splitLine) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, count+1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + ", count : " + entry.getValue());
	    }
		//	map.forEach((k,v)->System.out.println(k,"value "+v));
		}

}
