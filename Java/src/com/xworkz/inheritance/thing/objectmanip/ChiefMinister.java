package com.xworkz.inheritance.thing.objectmanip;

public class ChiefMinister {
	private String name;
	private String party;
	private String state;
	private int age;
	private char gender;
	private String religion;
	private boolean good;
	private String education;
	private int dOByear;
	private int tennureStart;
	private int tennureEnd;
	private float approvalRating;
	private int totalTimeCM;

	public ChiefMinister(String name, String party, String state, int age, char gender, String religion, boolean good,
			String education, int dOByear, int tennureStart, int tennureEnd, float approvalRating, int totalTimeCM) {
		this.name = name;
		this.party = party;
		this.state = state;
		this.age = age;
		this.gender = gender;
		this.religion = religion;
		this.good = good;
		this.education = education;
		this.dOByear = dOByear;
		this.tennureStart = tennureStart;
		this.tennureEnd = tennureEnd;
		this.approvalRating = approvalRating;
		this.totalTimeCM = totalTimeCM;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("obj is CM type,can comapare");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister cm = this;
				ChiefMinister cm2 = casted;
				if (cm.name.equals(cm2.name) && cm.party.equals(cm2.party) && cm.state.equals(cm2.state)
						&& cm.age == cm2.age && cm.gender == cm2.gender && cm.religion.equals(cm2.religion)
						&& cm.good == cm2.good && cm.education.equals(cm2.education) && cm.dOByear == cm2.dOByear
						&& cm.tennureStart == cm2.tennureEnd && cm.approvalRating == cm2.approvalRating
						&& cm.totalTimeCM == cm2.totalTimeCM) {
					System.out.println("CM and CM2 is same");
					return true;
				} else {
					System.err.println("CM and CM2 not same");
				}
			} else {
				System.err.println("obj is not CM,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " Party: " + this.party + " State: " + this.state + " Age: " + this.age
				+ " Gender: " + this.gender + " Religion: " + this.religion + " is person good: " + this.good
				+ " Education: " + this.education + " Birth Year: " + this.dOByear + " Tennure Start: "
				+ this.tennureStart + " Tennure End: " + this.tennureEnd + " Approval Ratting: " + this.approvalRating
				+ "Total duration of that CM: " + this.totalTimeCM;
	}
}