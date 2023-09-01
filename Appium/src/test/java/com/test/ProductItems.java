package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;


public Product(int id, String name, float price) {
	super();
	id=this.id;
	name=this.name;
	price=this.price;
}
}
public class ProductItems {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Bakkadi",800.5f));
		list.add(new Product(2,"Royal Accord",950.7f));
		list.add(new Product(3,"Red Label",1007.9f));
		
		System.out.println("Sorts the basic name");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);			
		});
		
		for(Product p:list) {
			System.out.println("Ans "+p.id +""  +p.name + ""+p.price);
		}
	}

}
