package com.learnings.core;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ParallelStreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum with reduce ====>"+sum(5));
		System.out.println("Sum with parallel stream  reduce ====>"+sumParallel(5000000));
		
		streamLoop();
	}

	public static Long sum(int n) {
		long sum=Stream.iterate(1, a->a+1).limit(n).reduce(0,(a,b)->a+b);
		return  sum;
	}
	public static Long sumParallel(int n) {
		long sum=Stream.iterate(1, a->a+1).parallel().limit(n).reduce(0,(a,b)->a+b);
		return  sum;
	}
	/*
	 * parallel stream doesn't give ordered values with ForEach, to get the Ordered values use ForEachOrdered 
	 */
	public static void streamLoop() {
		Supplier<Stream<String>> steamList=()->Stream.of("rajesh","ravi","kiran","kishore","advik","rajsh","rvi","ran","kisre","adk");
		System.out.println("Stream List with ForEach ===> \n");
		/*
		 * returns ordered values 
		 */
		steamList.get().forEach(s->System.out.println(s));
		System.out.println("Stream List with ForEach parallel ===> \n");
		/*
		 * returns without ordered values 
		 */
		steamList.get().parallel().forEach(s->System.out.println(s));
		System.out.println("Stream List with ForEach parallel ===> \n");
		/*
		 * returns ordered values 
		 */
		steamList.get().parallel().forEachOrdered(s->System.out.println(s));
		
			
		
	}

}

