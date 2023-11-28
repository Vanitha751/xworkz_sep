package com.xworkz.shopping.things;

public class Accounts extends Bank {

	public Accounts() {
		super("canara","vanitha","ABCD1234567",20000);
		System.out.println("Thus us the derived class");
		System.out.println(super.getAccountName());
	System.out.println(super.getAcountHolder());
	System.out.println(super.getAccountNumber());
	System.out.println(super.getTotalAmmount());
	}

}
