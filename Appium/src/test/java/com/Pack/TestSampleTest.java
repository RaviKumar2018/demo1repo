package com.Pack;

public class TestSampleTest {

	public static void main(String[] args) {
		
		Runnable r=()-> {

            for(int i=0;i<10;i++) {System.out.println("Child Thread");}};

        Thread t = new Thread();

        t.start();

        for(int i=0;i<10;i++) {

            System.out.println("Parent Class");

        }

	}

}
