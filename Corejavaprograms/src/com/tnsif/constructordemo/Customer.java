package com.tnsif.constructordemo;

public class Customer {
	// demo for constructor

		
		private String customername;
		private String customeraddress;
		private int customerid;
		
		
		// default const
		
		public Customer() {
			System.out.println("default constructor");
		}
		
		// parameter constructor
		
		public Customer(String customername, String customeraddress, int customerid) {
			super();
			this.customername = customername;
			this.customeraddress = customeraddress;
			this.customerid = customerid;
		}

		
		// getter and setter
		
		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public String getCustomeraddress() {
			return customeraddress;
		}

		public void setCustomeraddress(String customeraddress) {
			this.customeraddress = customeraddress;
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		@Override
		public String toString() {
			return "Customer [customername=" + customername + ", customeraddress=" + customeraddress + ", customerid="
					+ customerid + "]";
		}
		
		

	}


