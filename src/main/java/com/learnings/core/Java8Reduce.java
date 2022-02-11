package com.learnings.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Reduce {
public static void main(String args[])
{
	int[] ints=new int[] {1,2,3,4,5,6,7,8};
	System.out.println("sum is "+Arrays.stream(ints).sum());
	List l=Arrays.asList(ints);
	int sum=Arrays.stream(ints).reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
	List<Integer> al=new ArrayList(List.of(1,2,3,4,5,6));
	int listSum=al.stream().reduce(0,(a,b)->a+b);
	System.out.println("list sum "+al);
	System.out.println("count "+al.stream().count());
	System.out.println("limit "+al.stream().limit(3).collect(Collectors.toList()));
	al.stream().collect(Collectors.toList());
	}

	
}
