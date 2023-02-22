package com.xworkz.inheritance.thing.objectmanip;

public class FootWare {

	private String brand;
	private int size;
	private String type;

	public FootWare(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in footware: " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof FootWare) {
				System.out.println("Object is footware can compare");
				FootWare casted = (FootWare) obj;
				FootWare footWare = this;
				FootWare footWare2 = casted;
				if (footWare.brand.equals(footWare2.brand) && footWare.size == footWare2.size
						&& footWare.type == footWare.type) {
					System.out.println("footWare and footWare2 is same");
					return true;
				} else {
					System.err.println("footWare and footWare2 are not same");
				}
			} else {
				System.out.println("Object is not a footware");
			}
		} else {
			System.err.println("object is null");
		}

		return super.equals(obj);
	}
	@Override
	public String toString() {

		return "Brand: "+this.brand+" size: "+this.size+" Type: "+this.type;
	}

}
