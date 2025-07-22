package com.tnsif.accessmodifierdemo;

public class Publicdemo {
	
	// demo for public access modifier

		
		public int a=9;   // data memebr
		
		private String name="ruva";
		
		protected float s=9.5f;
		
		int u=9;
		
		public void display() {  // method
			System.out.println("welcome");
		}
		
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		
		System.out.println(p.name);
		
		System.out.println(p.a);
		
		System.out.println(p.s);
		
		System.out.println(p.u);
		
		p.display();
	}
	}


	

	 class Demo {
		
		public static void main(String[] args) {
			Publicdemo p=new Publicdemo ();
			System.out.println(p.a);
			
		//	System.out.println(p.name);
			
			System.out.println(p.s);
			
			System.out.println(p.u);
		}

	}



