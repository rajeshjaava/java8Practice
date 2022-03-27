package com.learnings.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingList {
	public static void main(String args[]) {
		List<User> arrayList=new ArrayList<User>(Arrays.asList(
				new User("rajesh",30),
				new User("divya",60),
				new User("advik",1)));
		arrayList.stream().forEach(System.out::println);
		System.out.println("Sorted List is ");
		
		List<User> sortedList=arrayList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		
		System.out.println("sorting names ");
		arrayList.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);
		
	}

}
