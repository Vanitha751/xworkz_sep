package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.House;
import com.xworkz.abstraction.things.HikeHouse;

public class HouseRunner {
public static void main(String[] args) {
	House house= new HikeHouse();
	house.colour();
	house.location();
	house.ownerName();
}
}
