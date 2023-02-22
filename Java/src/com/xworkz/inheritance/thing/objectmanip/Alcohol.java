package com.xworkz.inheritance.thing.objectmanip;

public class Alcohol {
    private String brand;
    private double alcoholPercentage;
    private double price;
    private String type;
    
    public Alcohol(String brand, double alcoholPercentage, double price, String type) {
        this.brand = brand;
        this.alcoholPercentage = alcoholPercentage;
        this.price = price;
        this.type = type;
    }
    @Override
    public boolean equals(Object obj) {
    	System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Alcohol) {
				System.out.println("obj is Alcohol type,can comapare");
				Alcohol casted = (Alcohol) obj;
				Alcohol alcohol = this;
				Alcohol alcohol2 = casted;
				if (alcohol.brand.equals(alcohol2.brand) & alcohol.alcoholPercentage == alcohol2.alcoholPercentage & alcohol.type.equals(alcohol2.type)
						& alcohol.price == alcohol2.price) {
					System.out.println("Alcohol and Alcohol2 is same");
					return true;
				} else {
					System.err.println("Alcohol and Alcohol2 not same");
				}
			} else {
				System.err.println("obj is not Alcohol,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
    	return super.equals(obj);
    }
    	
    	public String toString() {
    		// TODO Auto-generated method stub
    		return "Brand: " + this.brand + " Alcohol Persentage : " + this.alcoholPercentage + " Type: " + this.type + " Price: "
    				+ this.price;
    	
    	
    }
}

