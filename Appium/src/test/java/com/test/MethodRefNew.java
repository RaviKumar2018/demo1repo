package com.test;

interface Messagable{
	Message run(String str);
}

class Message{
	
	Message(String str){
		System.out.println(str);		
	}
}

public class MethodRefNew {
	
	public static void main(String[] args) {
		
		Messagable msg=Message::new;
		msg.run("Welcome");
	}

}
