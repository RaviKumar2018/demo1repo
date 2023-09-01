package com.test;

import java.util.*;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Kumar");
		list.add("Chennai");
		list.add("Tidal");
		
		list.forEach(
				(n) ->System.out.println(n)
				);
	}

}
