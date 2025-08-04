package com.tnsif.interafcedemo;

public class Nestedinterface implements Myinterface.MyInnerInterfcae {

	@Override
	public void print() {
		System.out.println("inner interface method");
		
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
	System.out.println(Nestedinterface.id);
	
	}

}
