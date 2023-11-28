package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.OwnCompany;
import com.xworkz.abstraction.things.HikeOwnCompany;

public class OwnCompanyRunner {
public static void main(String[] args) {
	OwnCompany own=new HikeOwnCompany();
	own.founderOfTheCompany();
	own.nameOfTheCompany();
}
}
