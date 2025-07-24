package com.tnsif.statickeyword;
// demo for static variable

public class Emplyee {
	// 3 proprties
	int eid;
	String name;
	static String company="TNS";
	
	Emplyee(int e,String n){
		eid=e;
		name=n;
	}
	void display() {
		System.out.println(eid +" "+name+" "+company);
	}
	
	public static void main(String[] args) {
		Emplyee e=new Emplyee(1,"Rakhi");
		Emplyee e1=new Emplyee(1,"Radhika");
		Emplyee e2=new Emplyee(1,"Raghu");
		
		e.display();
		e1.display();
		e2.display();
		
		
	}

}
