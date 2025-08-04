package com.tnsif.abstractiondemo;
// demo for abstraction

public abstract class Shape {
	
	protected float area;  // property 
	
	// abstract method
	
	abstract void calarea();
	
	// Concrete method
	
   void show() {
	   System.out.println("area of shape "+area);
   }
}
