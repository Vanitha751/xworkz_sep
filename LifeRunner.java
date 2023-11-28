package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.Life;
import com.xworkz.abstraction.things.HikeLife;

public class LifeRunner{
	public static void main(String[] args) {
		Life life= new HikeLife();
		life.currentLocation();
		life.age();
		life.beliefSystem();
		life.birthPlace();
		life.currentLocation();
		life.gender();
		life.hobbies();
		life.isMarried();
		life.primaryLanguage();
		life.strengths();
	}
	
	

}
