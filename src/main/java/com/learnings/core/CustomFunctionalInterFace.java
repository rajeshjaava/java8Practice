package com.learnings.core;


/*
 *  author : Rajesh Thokala
 *  
 */
public class CustomFunctionalInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestFunction fn= t-> t+"";
    System.out.println("Function data "+fn.invoke(10));
     //supplier custom interface
    SupplierFunction values=()->10;
    System.out.println("supplier data "+ values.supply());
    COnsumerFunctionInterface consumeObj=s->System.out.println("Invoked .."+s);
    consumeObj.consume("Rajesh");
	}

}
@FunctionalInterface
 interface TestFunction{
	public abstract String invoke(Integer i);
 }

@FunctionalInterface
interface SupplierFunction{
	public abstract Integer supply();
	
}

@FunctionalInterface
interface COnsumerFunctionInterface{
	public abstract void consume(String s);
	
}