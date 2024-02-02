package com.xworkz.collections.things;

public class WatchDto {

	private String companyName;
	private int price;
	private String colour;
	private String shape;
	private String quality;
	private String shoppingType;
	
	public WatchDto(String string, int i, String string2, String string3, String string4, String string5) {
   System.out.println("Constructor");
   }
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		return true;
	}
	@Override
	public String toString() {
		return "WatchDto [companyName=" + companyName + ", price=" + price + ", colour=" + colour + ", shape=" + shape
				+ ", quality=" + quality + ", shoppingType=" + shoppingType + "]";
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getShoppingType() {
		return shoppingType;
	}
	public void setShoppingType(String shoppingType) {
		this.shoppingType = shoppingType;
	}
	
}
