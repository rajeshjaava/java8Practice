package com.learnings.core;
/*
 * author : Rajesh Thokala
 */
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		    Stream<Integer> firstStream = Stream.of(1, 2, 3);
		      Stream<Integer> secondStream = Stream.of(4, 5, 6);
		       
		      Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
		       
		      System.out.println( resultingStream.collect(Collectors.toList()) );
	}

}
