package com.tnsif.stringsdemo;
// demo for string programs

public class Stringdemo {
 public static void main(String[] args) {
	// creating a string by using new keyword
	 
	 String str=new String("hello");
	 
	 System.out.println(str);
	 
	 str=str.concat("welcome");
	 System.out.println(str);
	 
	 //length
	 
	 System.out.println(str.length());
	 // index of the string
	 System.out.println(str.indexOf("h"));
	 
	 System.out.println("character at "+ str.charAt(5));
	 
	 System.out.println(str.toLowerCase());
	 
	 System.out.println(str.toUpperCase());
}
}
