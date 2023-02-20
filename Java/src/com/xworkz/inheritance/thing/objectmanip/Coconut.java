package com.xworkz.inheritance.thing.objectmanip;

public class Coconut {
	
	private int price;
	private String loacation;
	private boolean sweet;
	private String size;
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setLoacation(String loacation) {
		this.loacation = loacation;
	}
	
	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}
	
	
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		
		return "Price: "+this.price+" Location: "+this.loacation+ " Sweetness: "+this.sweet+ " Size: "+this.size;
	}
	
	@Override
	public int hashCode() {

		return 587;
	}
	

}
