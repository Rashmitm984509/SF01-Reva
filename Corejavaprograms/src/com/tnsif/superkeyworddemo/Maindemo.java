package com.tnsif.superkeyworddemo;

public class Maindemo extends Superdemo {
	
	int a=10;
	
	void driniking() {
		System.out.println("boost");
	}
	
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		
		
		super.driniking();
		
	}
	
	
	public static void main(String[] args) {
		Maindemo d=new Maindemo();// object creation
		
		//System.out.println(d.a);
		d.display();
		d.driniking();
	}

}
