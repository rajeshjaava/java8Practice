package com.learnings.core;
/*
 *  author : Rajesh Thokala
 *  
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public static void main(String args[]) {
		Employe e1=new Employe(1,"rajesh",100000,"tpt","IT");
		Employe e2=new Employe(2,"rakesh",90000,"ptr","BPO");
		Employe e3=new Employe(3,"ramesh",170000,"ctr","IT");
		Employe e4=new Employe(4,"suresh",40000,"tpt","Teaching");
		List<Employe> eList=new ArrayList<Employe>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.stream().forEach(System.out::println);
		System.out.println("**************************************************");
		//sorting employees based on name
		Comparator <Employe> ecomp=(a,b)->a.getName().compareTo(b.getName());
		List<Employe> sortedList=eList.stream().sorted(ecomp).collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		System.out.println("*************************************************");
		eList.stream().collect(Collectors.groupingBy(Employe::getAddress)).
		forEach((k,v)->System.out.println(" Key : "+k+" 	value :"+v));
		
				/* group by dept whose sal is greater than 50k
				 *  
				 */
		System.out.println(" Group by dept with sal greater than 50k ");
		eList.stream().filter(t->t.getSal()>50000).collect(Collectors.groupingBy(Employe::getDept))
		.forEach((k,v)->System.out.println("Key : "+k+"  Value  :"+v));
		
		
	}

}
 class Employe{
	 public Employe(int id,String name,long sal,String address,String dept ){
		 this.id=id;
				 this.name=name;
		 this.sal=sal;
		 this.address=address;
		 this.dept=dept;
	 }
	 public void setDept(String dept) {
		 this.dept=dept;
	 }
	 public String getDept() {
		 return dept;
	 }
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	private int id;
	 private String name;
	 private String address;
	 private long sal;
	 private String dept;
	 public String toString() {
		 return "id : "+id+" name :"+name+" address : "+address+"  sal  : "+sal+ "Dept "+dept ;
	 }
	 
 }
 
