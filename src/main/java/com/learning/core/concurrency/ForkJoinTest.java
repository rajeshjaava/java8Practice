package com.learning.core.concurrency;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest extends RecursiveTask<Integer>{

	public static void main(String[] args) {
		int []numbers= {10,7,90,87,67,90};
		System.out.println("available processors   :  "+Runtime.getRuntime().availableProcessors());
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        Integer min = pool.invoke(new ForkJoinTest(numbers, 0, numbers.length - 1));
        System.out.println(min);
    

	}
	 private static final long serialVersionUID = 1L;
	    private int[] numbers;
	    private int startIndex;
	    private int endIndex;
	 
	    public ForkJoinTest(int[] numbers, int startIndex, int endIndex) {
	        this.numbers = numbers;
	        this.startIndex = startIndex;
	        this.endIndex = endIndex;
	    }
	    
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		int sliceLength = (endIndex - startIndex) + 1;
        if (sliceLength > 2) {
        	ForkJoinTest firstHalf = new ForkJoinTest(numbers, startIndex, startIndex + (sliceLength / 2) - 1);
            firstHalf.fork();
            ForkJoinTest secondHalf = new ForkJoinTest(numbers, startIndex + (sliceLength / 2), endIndex);
            secondHalf.fork();
            return Math.min(firstHalf.join(), secondHalf.join());
        } else {
            return Math.min(numbers[startIndex], numbers[endIndex]);
        }
	}

}
