package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.objectmanip.ChiefMinister;

public class ChiefMinisterRunner {
	public static void main(String[] args) {
		ChiefMinister cm = new ChiefMinister("Basavraj Bommai", "BJP", "Karnataka", 63, 'M',
				"Hindu", true, "BE in Mechanical Engg", 1960, 2021, 2024, 85.6f, 3);
		ChiefMinister cm2 = new ChiefMinister("Y.S. Jaganmohan Reddy", " YSR",
				"Andhra Pradesh", 49, 'M', "Hindu", true, "Bachelor of Commerce", 1974, 2019, 2023, 90.1f, 5);

		System.out.println(cm.equals(cm2));
		ChiefMinister cm3 = new ChiefMinister("Basavraj Bommai", "BJP", "Karnataka", 63, 'M',
				"Hindu", true, "BE in Mechanical Engg", 1960, 2021, 2024, 85.6f, 3);
		System.out.println(cm.equals(cm3));
	}

}
