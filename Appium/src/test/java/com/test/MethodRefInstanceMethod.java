package com.test;

interface Sayable{
	public void say();
}

public class MethodRefInstanceMethod {

	public void saySomthing() {
		
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		
		Sayable said= new MethodRefInstanceMethod()::saySomthing;
		said.say();
	}
}
