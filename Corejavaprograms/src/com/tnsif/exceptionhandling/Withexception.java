package com.tnsif.exceptionhandling;
// with exception
public class Withexception {
public static void main(String[] args) {
	int d=0;
	
	try {
		System.out.println("hello world");
		int a=55/0;
		System.out.println("hello");
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	
}
}
