package com.tnsif.stringsdemo;
// demo for equals ignore demo
public class Ignoredemo {
	
	public static void main(String[] args) {
		String s1="sachin";
		String s2="SACHIN";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
