package com.xworkz.inheritance.thing.objectmanip;

public class Fridge {
	private String brand;
	private String model;
	private String color;
	private int height;
	private int width;
	private int depth;
	private int capacity;
	private boolean hasFreezer;
	private boolean hasWaterDispenser;
	private boolean hasIceMaker;
	private int energyRating;
	private boolean isSmart;

	public Fridge(String brand, String model, String color, int height, int width, int depth, int capacity,
			boolean hasFreezer, boolean hasWaterDispenser, boolean hasIceMaker, int energyRating, boolean isSmart) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.capacity = capacity;
		this.hasFreezer = hasFreezer;
		this.hasWaterDispenser = hasWaterDispenser;
		this.hasIceMaker = hasIceMaker;
		this.energyRating = energyRating;
		this.isSmart = isSmart;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fridge) {
				System.out.println("obj is CM type,can comapare");
				Fridge casted = (Fridge) obj;
				Fridge fridge = this;
				Fridge fridge2 = casted;
				if (fridge.brand.equals(fridge2.brand) && fridge.model.equals(fridge2.model)
						&& fridge.color.equals(fridge2.color) && fridge.height == fridge2.height
						&& fridge.width == fridge2.width && fridge.capacity == fridge2.capacity
						&& fridge.depth == fridge2.depth && fridge.hasFreezer == fridge2.hasFreezer
						&& fridge.energyRating == fridge2.energyRating
						&& fridge.hasWaterDispenser == fridge2.hasWaterDispenser
						&& fridge.hasIceMaker == fridge2.hasIceMaker && fridge.isSmart == fridge2.isSmart) {
					System.out.println("Fridge and Fridge2 is same");
					return true;
				} else {
					System.err.println("Fridge and Fridge2 not same");
				}
			} else {
				System.err.println("obj is not Fridge,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Brand: " + this.brand + " Model: " + this.model + " color: " + this.color + " Height: " + this.height
				+ " Width: " + this.width + " Depth " + this.depth + " Capacity: " + this.capacity + " Has Freezer : "
				+ this.hasFreezer + " Energy Rating: " + this.energyRating + " Has water Dispenser: "
				+ this.hasWaterDispenser + " Has IceMaker: " + this.hasIceMaker + " is Smart: " + this.isSmart;
	}

}
