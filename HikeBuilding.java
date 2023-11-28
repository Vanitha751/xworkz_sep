package com.xworkz.abstraction.things;

import com.xworkz.abstraction.abstracts.Building1;

public class HikeBuilding extends Building1 {

	@Override
	public void constructionFoundation() {
	System.out.println("constructionFoundation method from Hike Building");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("buildWallsmethod from Hike Building");
		
	}

	@Override
	public void addRoof() {
		System.out.println("addRoof method from Hike Building");
		
	}

	@Override
	public void paintBuilding() {
		System.out.println("paintBuilding method from Hike Building");
		
	}

	@Override
	public void terous() {
		System.out.println("terous method from Hike Building");
		
	}

}
