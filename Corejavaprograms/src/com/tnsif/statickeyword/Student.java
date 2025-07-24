package com.tnsif.statickeyword;
// demo for static method

public class Student {
	int rollno;
	String name;
	static String college="Reva university";
	
	//static method change value
	
	static void change() {
		college="Reva";
		
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student.change();
		
		Student s1=new Student(1,"kusuma");
		Student s2=new Student(2,"sushma");
		Student s3=new Student(3,"suma");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
