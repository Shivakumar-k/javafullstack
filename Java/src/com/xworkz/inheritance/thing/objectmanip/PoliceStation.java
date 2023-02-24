package com.xworkz.inheritance.thing.objectmanip;

public class PoliceStation {
	private int totOfficers;
	private int totCases;
	private int totPrisnors;
	private String location;
	private int vehicles;
	private String sIName;
	private String city;
	private int totCells;
	private int totGuns;
	private boolean open;

	public PoliceStation(int totOfficers, int totCases, int totPrisnors, String location, int vehicles, String sIName,
			String city, int totCells, int totGuns, boolean open) {

	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof PoliceStation) {
				System.out.println("obj is Policestation type,can comapre");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation policeStation = this;
				PoliceStation policeStation2 = casted;
				if (policeStation.totOfficers==policeStation2.totOfficers && policeStation.totCases==policeStation2.totCases && policeStation.totPrisnors==policeStation2.totPrisnors && policeStation.location.equals(policeStation2.location) && policeStation.vehicles==policeStation2.vehicles && policeStation.sIName.equals(policeStation2.sIName) && policeStation.city.equals(policeStation2.city) && policeStation.totCells==policeStation2.totCells && policeStation.totGuns==policeStation2.totGuns && policeStation.open==policeStation2.open) {
					System.out.println("Police Station and Police Station2 is same");
					return true;
				} else {
					System.err.println("Police Station and Police Station2 not same");
				}
			} else {
				System.err.println("obj is not Police Station,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}
}
