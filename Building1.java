package com.xworkz.abstraction.abstracts;

import com.xworkz.building.dto.BuildingDto;

public  abstract class Building1 {    
	public abstract void constructionFoundation();
	public abstract void buildWalls();
	public abstract void addRoof();
	public abstract void paintBuilding();
	public abstract void terous();
	
	public abstract void read();
	public boolean onSave(BuildingDto buildingDto) {
		return false;
	}
}
