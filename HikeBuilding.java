package com.xworkz.abstraction.things;

import com.xworkz.abstraction.abstracts.Building1;
import com.xworkz.building.dto.BuildingDto;

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
	Object obj[]= new Object[4];
	int index=0;
	@Override
	public boolean onSave(BuildingDto buildingDto) {
		if(buildingDto!=null) {
			System.out.println("Dto is not null");
			if(index<obj.length) {
				obj[index]=buildingDto;
				index++;
				return true;
			}
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}


	@Override
	public void read() {
		for(Object object:obj) {  
			System.out.println("Building obj is:"+object);
		}
		
	}

}
