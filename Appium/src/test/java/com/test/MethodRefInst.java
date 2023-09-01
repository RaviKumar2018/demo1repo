package com.test;

import java.util.function.BiFunction;

class Runnable{
	
	public int add(int a, int b) {
		return a+b;
	}
}

public class MethodRefInst {

	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> add1=new Runnable()::add;
		Integer result = add1.apply(10, 20);
		System.out.println(result);
	}

}
