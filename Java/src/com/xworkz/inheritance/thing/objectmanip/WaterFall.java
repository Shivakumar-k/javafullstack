package com.xworkz.inheritance.thing.objectmanip;

public class WaterFall {
	
	private String name;
	private int height;
	private String location;
	
	public WaterFall(String name,int height, String location) {
		this.name = name;
		this.height = height;
		this .location = location;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in waterfall: " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof WaterFall) {
				System.out.println("Object is waterfall can compare");
				WaterFall casted = (WaterFall) obj;
				WaterFall waterfall = this;
				WaterFall waterfall2 = casted;
				if (waterfall.name.equals(waterfall2.name) && waterfall.height == waterfall2.height
						&& waterfall.location.equals(waterfall2.location)) {
					System.out.println("waterfall and waterfall2 is same");
					return true;
				} else {
					System.err.println("waterfall and waterfall2 are not same");
				}
			} else {
				System.out.println("Object is not a waterfall");
			}
		} else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}
	public String toString() {

		return "Name: "+this.name+" Height: "+this.height+" Location: "+this.location;
	}
	
	
	

}
