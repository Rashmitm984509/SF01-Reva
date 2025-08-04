package com.tnsif.abstractiondemo;

public class Square extends Shape {
	
	private float side;
	
	public Square() {
		side=2.0f;
	}
	public  Square(float side) {
		this.side=side;
	}

	@Override
	void calarea() {
		super.area=side*side;
		
	}
	
	public static void main(String[] args) {
//		Square s=new Square();
//		System.out.println(s);
		
		Shape s1=new Square();
		s1.calarea();
		s1.show();
	
		Shape sh=new Square(4.0f);
		sh.calarea();
		sh.show();
	}

}
