package com.tnsif.polymorphsim;
// child class
public class Childdemo extends Parentdemo {
	
	@Override
	void driniking() {
		System.out.println("juice");
	}
	

	public static void main(String[] args) {
		Childdemo c=new Childdemo();
		
		c.driniking();
		
	}
}
