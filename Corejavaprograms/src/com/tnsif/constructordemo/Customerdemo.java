package com.tnsif.constructordemo;

import java.util.Scanner;

public class Customerdemo {
	
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the customer name");
			String name=sc.next();
			
			System.out.println("enter the customer address");
			String address=sc.next();
			
			System.out.println("enter the customer id");
			int id=sc.nextInt();
			
			Customer c=new Customer();
			
			c.setCustomername(name);
			c.setCustomeraddress(address);
			c.setCustomerid(id);
			
			System.out.println(c);
			
			boolean b=c instanceof Customer;
			
			System.out.println(b);
			
			
		}

	}

