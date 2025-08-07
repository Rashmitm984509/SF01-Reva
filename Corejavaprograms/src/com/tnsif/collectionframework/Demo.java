package com.tnsif.collectionframework;

import java.util.ArrayList;

// demo for arraylist

public class Demo {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		System.out.println(l1.size());
		
		// add() - it will add the data
		
		l1.add(11);
		l1.add("rose");
		l1.add(8.9f);
		l1.add('r');
		
		System.out.println(l1.size());
		System.out.println(l1);
	}

}
