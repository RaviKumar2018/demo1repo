package com.test;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test
	public void sumEven() {
		
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = input.nextInt();
		for (int i = 1; i <=number; i++) {
			
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum"+sum);
	}
	
	@Test
	public void addTwoNum() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = input.nextInt();
		System.out.println("Enter the Number");
		int b = input.nextInt();
//		int a=10;int b=20;
		System.out.println("Number"+(a+b)); //add
		System.out.println("Number"+(a-b)); //minus
		System.out.println("Number"+(a/b)); //divide
		System.out.println("Number"+(a*b)); //multiple
		System.out.println("Number"+(a%b)); //module	
	}
	
	@Test
	public void multipleTable() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println((a+"*"+i)+"="+(a*i));
		}
	}
	
	@Test
	public void javaLetter() {
		
	System.out.println("   J    a   v     v  a");
	System.out.println("   J   a a   v   v  a a");
	System.out.println("J  J  aaaaa   V V  aaaaa");
	System.out.println(" JJ  a     a   V  a     a");
	
	}
	
	@Test
	public void areaCal() {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		float r = input.nextFloat();
	// (22/7)*r^2
		System.out.println((22/7)*(r*r));
	}
	
	@Test
	public void array() {
	
		int[] number = new int[] {11,12,13,14,15};
		for(int i=0;i<number.length;i++) {
			System.out.println("Integer Value: "+number[i]);
		}
		
		String[] letters = new String[] {"Java","Python","Selenium","Cybress",".NET"};
		for(int i=0;i<letters.length;i++) {
			System.out.println("String Values: "+letters[i]);
		}
	}
	
	@Test
	public void arrayAdd() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Rows");		
		int row = scanner.nextInt();
		
		System.out.println("Enter Columns");		
		int column = scanner.nextInt();
		
		int[][] num = new int[row][column];
		for(int i =0;i<row;i++) {
			System.out.println("Enter Row Value");
			for(int j=0;i<column;i++) {
				num[i][j]=scanner.nextInt();
			}
		
			 System.out.println("You have entered all the numbers");
		     System.out.println("All numbers from array: ");
		
		
	}
		for(int i=0;i<row;i++) {
			 
		 }
	}
	
	@Test
	public String oddOrEven(int number) {

		if(number%2==0) {
			return "Even";
		} else {
			return "Odd";
		}
	
	}
	
	@Test
	public void add2Num() {

		int a=3;
		int b=6;
		int sum=a+b;
		
		System.out.println( a + "+" + b + " = "+ "Sum= "+sum );
			
	}
	
	@Test
	public void ascii() {
		
		char ch='c';
		int ascii=ch;
		int conascci=ch;
		System.out.println("ASCII Value of "+ ch + " is " + ascii);
		System.out.println("ASCII Value of "+ ch + " is " + conascci);	
	}
	
	@Test
	public void remainderAndQuotient() {	
		
		int divident=25; int divisor =4;
		
		int quotient = divident/divisor;
		int remainder = divident%divisor;
		System.out.println("Quotient is " + quotient);
		System.out.println("Remainder" + remainder);
	}
	
	@Test
	public void swap2() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int a = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the Number 2");
		int b = input1.nextInt();
		System.out.println("Before swap");
		
		System.out.println(a);
		System.out.println(b);	
		//with using temp
/*		int temp=a;		
		a=b;
		b=temp;  */
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After swap");
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void oddOrEven() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		
		String oddEven =(num%2==0)?"even":"odd"; 
		System.out.println(oddEven);
//		{
//			System.out.println(num + " is Even");
//		} else {
//			System.out.println(num + " is Odd");
//		}	
	
	}
	
	@Test
	public void reverseString() {
		
		String str="Hello";
		String Rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			Rev=Rev+str.charAt(i);
		}
		System.out.println(Rev);
	}	
	
	@Test
	public void jdbcConversion() {
		
		
	}
}
