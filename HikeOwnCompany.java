package com.xworkz.abstraction.things;

import com.xworkz.abstraction.abstracts.OwnCompany;

public class HikeOwnCompany extends OwnCompany {

	@Override
	public void nameOfTheCompany() {
		System.out.println("nameOfTheCompany method for HikeCompany");
	}

	@Override
	public void founderOfTheCompany() {
		System.out.println("founderOfTheCompany method for HikeOwnCompany ");
	}

}
