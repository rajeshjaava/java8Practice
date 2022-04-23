package com.learnings.core;
/*
 *  author : Rajesh Thokala
 *  
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @Author Rajesh Thokala
 */
public class Java8Map {
	public static void main(String args[]) {
		List<String> l=Arrays.asList("Rajesh","thokala","divya","advik");
		List<String> s=l.stream().map(String::toUpperCase).collect(Collectors.toList());
		s.stream().forEach(System.out::println);
		List<Integer> i=Arrays.asList(1,2,3,4,5);
		i.stream().map(n->n*2).forEach(System.out::println);
				}

}
