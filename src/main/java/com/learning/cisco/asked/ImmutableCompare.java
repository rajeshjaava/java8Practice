package com.learning.cisco.asked;

import java.util.Objects;
/* 
author : Rajesh thokala 
*/
public class ImmutableCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHandler c1=new CarHandler(1,"hunadi");
		CarHandler c2=new CarHandler(2,"kia");
		CarHandler c3=new CarHandler(1,"hunadi");
		System.out.println("comparing objects data");
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c1.equals(c3));
		
		
	}

}
final class CarHandler{
	private int number;
	private String name;
	public CarHandler(int number,String name) {
		this.number=number;
		this.name=name;
	}
	public int getNumber() {
		return number;	
	}
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarHandler other = (CarHandler) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}
	
}
