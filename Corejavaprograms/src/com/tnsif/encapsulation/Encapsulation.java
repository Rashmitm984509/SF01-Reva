
package com.tnsif.encapsulation;

//demo for encapsulation

public class Encapsulation {
	
	int serialnumber; // data memebrs or proprties
	String name;
	int age;
	
	void show() {
	System.out.println(serialnumber +" "+name+" "+age);
	}

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation ();
		
		e.serialnumber=1;
		e.name="rashmi";
		e.age=25;
		
		e.show();
	}
}



