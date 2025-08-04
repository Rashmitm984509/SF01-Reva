package com.tnsif.interafcedemo;
// demo for nested interface

// outer interface
public interface Myinterface {
	void calculatearea();
	
	// nested interface
	
	interface MyInnerInterfcae{
		int id=30;
		void print();
	}

}
