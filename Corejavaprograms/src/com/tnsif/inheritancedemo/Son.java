package com.tnsif.inheritancedemo;

public class Son extends Father {
String cycle ="pink";
	
	public static void main(String[] args) {
		Son s=new Son();
		
		System.out.println(s.car);
		System.out.println(s.money);
		System.out.println(s.cycle);
		
		s.drinking();
		s.reading();
	}

}
