package com.xworkz.building.dto;

public class BuildingDto {
	private String constructionFoundation;
	private String buildWalls;
	private int addRoof;
	private String paintBuilding;
	private String terous;
	@Override
	public String toString() {
		return "BuildingDto [constructionFoundation=" + constructionFoundation + ", buildWalls=" + buildWalls
				+ ", addRoof=" + addRoof + ", paintBuilding=" + paintBuilding + ", terous=" + terous + "]";
	}
	@Override
	public int hashCode() {
		return addRoof;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuildingDto other = (BuildingDto) obj;
		return true;
	}
	public BuildingDto() {
	System.out.println("No-Args Constructor");
	}
	public BuildingDto(String constructionFoundation, String buildWalls, int addRoof, String paintBuilding,
			String terous) {
		this.constructionFoundation = constructionFoundation;
		this.buildWalls = buildWalls;
		this.addRoof = addRoof;
		this.paintBuilding = paintBuilding;
		this.terous = terous;
		System.out.println("All-Args constructor");
	}
	public String getConstructionFoundation() {
		return constructionFoundation;
	}
	public void setConstructionFoundation(String constructionFoundation) {
		this.constructionFoundation = constructionFoundation;
	}
	public String getBuildWalls() {
		return buildWalls;
	}
	public void setBuildWalls(String buildWalls) {
		this.buildWalls = buildWalls;
	}
	public int getAddRoof() {
		return addRoof;
	}
	public void setAddRoof(int addRoof) {
		this.addRoof = addRoof;
	}
	public String getPaintBuilding() {
		return paintBuilding;
	}
	public void setPaintBuilding(String paintBuilding) {
		this.paintBuilding = paintBuilding;
	}
	public String getTerous() {
		return terous;
	}
	public void setTerous(String terous) {
		this.terous = terous;
	}
	
	
	
}
