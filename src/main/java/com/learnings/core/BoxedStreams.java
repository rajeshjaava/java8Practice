package com.learnings.core;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * author : Rajesh Thokala
 */
public class BoxedStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> instream=IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
		List<Integer> instream1=IntStream.of(1,2,3,4,5,4,5).boxed().distinct().collect(Collectors.toList());
	//	intstream.
		instream.forEach(System.out::println);
		instream1.forEach(System.out::println);
	}

}
