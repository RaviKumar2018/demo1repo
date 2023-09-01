package com.test;

interface Interf{
	public void add(int a,int b);
}

public class LamdaAdd {
	
	public static void main(String[] args) {
		
		Interf i = (int a,int b)->{
			System.out.println("Added :"+ (a+b));
		};
		i.add(20, 30);
		i.add(100, 100);
	}

}