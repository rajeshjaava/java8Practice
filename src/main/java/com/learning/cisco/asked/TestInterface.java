package com.learning.cisco.asked;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		String type=car. getModel();
		int s=car.size;
		

	}

}
interface Vehicle{

public static final  int size=10; // need to check

 abstract String  getModel();

}

class Car implements Vehicle {

	public String  getModel(){
	return "Hundia";
	}
}


