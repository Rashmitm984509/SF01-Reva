package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample {
public static void main(String[] args) {
	ArrayList<String> l=new ArrayList();
	
	// add()

	l.add("rose");
	l.add("mango");
	l.add("orange");
	
	System.out.println(l);
	
	//traversing list through iterator
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
