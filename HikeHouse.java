package com.xworkz.abstraction.things;

import com.xworkz.abstraction.abstracts.House;

public class HikeHouse extends House{

	@Override
	public void location() {
		System.out.println("location method from hikeHouse");
	}

	@Override
	public void colour() {
		System.out.println("colour method from hikeHouse");

	}

	@Override
	public void ownerName() {
		System.out.println("ownerName method from hikeHouse");

	}

}
