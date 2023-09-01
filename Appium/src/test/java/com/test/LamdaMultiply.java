package com.test;

interface Interfe{
	public int squareIt(int a);
}
public class LamdaMultiply {

	public static void main(String[] args) {
	
		Interfe ir= a->a*a;
		System.out.println(ir.squareIt(10));
		System.out.println(ir.squareIt(30));
	}

}
