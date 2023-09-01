package com.test;

import java.util.ArrayList;
import java.util.List;

interface Sentance{
	public String sent(String name);
}
public class Aruguments {
	
	public static void main(String[] args) {
		
		Sentance s=(message)->{
			
			String str1= "Hello";
			String str2 = str1+message;
			return str2;
			
		};
		System.out.println(s.sent("Where are "));
		
		Thread t =new Thread();
		t.start();
		Sentance r2 =(name)->{
			System.out.println("Thread");
			return name;
		};
		System.out.println(r2.sent("Congrats"));
}

}