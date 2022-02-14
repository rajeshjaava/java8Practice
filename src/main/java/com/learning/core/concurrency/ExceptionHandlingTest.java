package com.learning.core.concurrency;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Au?t'p-=[o-generated method stub
		
		test();


	}
	public static void test() {
		try {
		testException();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
		
	}
	public static void testException() {
		
		System.out.println("test exception started ");
		try {
//		int i=10;
	//	int j=i/0;
	throw new ArithmeticException("arthimetic exception ");
		}
		catch(Exception e) {
				System.out.println(" arthimetic exception occured "+e.getMessage());
			
			throw new CustomException("Exception occured during executtion ");
		}
		
	}
	
	
	
	
	
	
	


}
