package com.learning.divya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Repeatedwordscount {
	
	
	public void getwordcount(String s1)
	{
		
		String[] str  = s1.split("");
		ArrayList<String> arr = new ArrayList(Arrays.asList(str));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String e: arr)

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
		
		String s = "I am Divya I love my husband and I love my son and family";
		Repeatedwordscount c = new Repeatedwordscount();
		c.getwordcount(s);
	}

}
