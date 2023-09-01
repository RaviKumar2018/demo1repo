package com.test;

public class Student {

	String name;
	int rollNum;
	int age;
	
  Student(String name,int rollNum, int age ) {

	  this.name=name;
	  this.rollNum=rollNum;
	  this.age=age;
	}
  public void callMethod() {
	  
	  System.out.println("Name: "+name);
	  System.out.println("RollNumber: "+rollNum);
	  System.out.println("Age: "+age);

}

	public static void main(String[] args) {
		
		Student student1 = new Student("Raju",11,26);
		
		Student student2 = new Student("Ramu",19,56);
		
		student1.callMethod();
		student2.callMethod();
	}

}
