package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.Building1;
import com.xworkz.abstraction.things.HikeBuilding;

public class Building1Runner {
public static void main(String[] args) {
	Building1 building= new HikeBuilding();
	building.constructionFoundation();
	building.buildWalls();
	building.addRoof();
	building.paintBuilding();
}
}
