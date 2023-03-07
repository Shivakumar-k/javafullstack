package com.xworkz.inheritance.boot;

import com.xworkz.abstraction.link.Apollo;
import com.xworkz.abstraction.link.Hospital;

public class ApolloRunner {

	public static void main(String[] args) {
		Apollo apollo = new Apollo();
		System.out.println(apollo.adhereToEthicalStandards());
		System.out.println(apollo.communicateClearly());
		System.out.println(apollo.ensurePatientComfort());
		System.out.println(apollo.followSafetyProtocols());
		System.out.println(apollo.handleMedicalEmergencies());
		System.out.println(apollo.maintainCleanliness());
		System.out.println(apollo.managePatientRecords());
		System.out.println(apollo.managePatientRecords());
		System.out.println(apollo.provideEffectiveTreatment());
		System.out.println(apollo.visitingHours());
		System.out.println(apollo.respectPatientPrivacy());
		
		System.out.println("----------------------");
		
		Hospital hosp = new Apollo();
		System.out.println(hosp.adhereToEthicalStandards());
		System.out.println(hosp.communicateClearly());
		System.out.println(hosp.ensurePatientComfort());
		System.out.println(hosp.followSafetyProtocols());
		System.out.println(hosp.handleMedicalEmergencies());
		System.out.println(hosp.maintainCleanliness());
		System.out.println(hosp.managePatientRecords());
		System.out.println(hosp.managePatientRecords());
		System.out.println(hosp.provideEffectiveTreatment());
		System.out.println(hosp.visitingHours());
		System.out.println(hosp.respectPatientPrivacy());
		
	System.out.println(hosp.hashCode());
	System.out.println(hosp.equals(hosp));
		
		
		
	}

}
