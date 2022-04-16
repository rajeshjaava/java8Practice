package com.learnings.core;

import java.util.stream.Stream;

public class ParallelStreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum with reduce ====>"+sum(5));
		System.out.println("Sum with parallel stream  reduce ====>"+sumParallel(5000000));
	}

	public static Long sum(int n) {
		long sum=Stream.iterate(1, a->a+1).limit(n).reduce(0,(a,b)->a+b);
		return  sum;
	}
	public static Long sumParallel(int n) {
		long sum=Stream.iterate(1, a->a+1).parallel().limit(n).reduce(0,(a,b)->a+b);
		return  sum;
	}

}

