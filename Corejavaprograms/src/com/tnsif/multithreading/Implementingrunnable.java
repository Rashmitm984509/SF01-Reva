package com.tnsif.multithreading;
// implementing runnable interface

public class Implementingrunnable implements Runnable{

	@Override
	synchronized public void run() {
		System.out.println("implementing runnable interface");
	}
	
	public static void main(String[] args) {
		Implementingrunnable t=new Implementingrunnable();
		
		Thread t1=new Thread(t);
		t1.start();
	}

}
