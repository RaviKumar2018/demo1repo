package com.test;

interface Interf2{
	
	public int returnOf(String str);
}


 class LamdaStringReturn implements Interf2{
	
	public int returnOf(String str) {
		
		return str.length();
	}
	
	public static void main(String[] args) {
		
		Interf2 i=(str)-> str.length();
			System.out.println(i.returnOf("HelloHowAreYou"));
			System.out.println(i.returnOf("STG InfoTech"));
			
	}

}
