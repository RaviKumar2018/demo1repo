package com.test;

import java.util.function.BiFunction;

class Arithmetic{
	
	public static int add(int a, int b) {
	return a+b;
	}
	
	public static float multi(int a, float b) {
		return a+b;
	}
	
	public static float divid(float a, float b) {
		return a+b;
	}
}
public class MethodRefArith {
	
	
	public static void main(String[] args) {
	
		BiFunction<Integer,Integer,Integer> add1=Arithmetic::add;
		BiFunction<Integer, Float,Float> add2=Arithmetic::multi;
		BiFunction<Float, Float, Float> add3=Arithmetic::divid;
		
		Integer r1 = add1.apply(10, 20);
		float r2 = add2.apply(20, 30.0f);
		float r3 = add3.apply(21.2f, 22.2f);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
