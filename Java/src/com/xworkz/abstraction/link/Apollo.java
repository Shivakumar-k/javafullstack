package com.xworkz.abstraction.link;

public class Apollo implements Hospital {
	
	@Override
	public String visitingHours() {
	   
	    return "visitors are allowed only during visiting Hours.";
	  }
	  
	@Override
	  public String maintainCleanliness() {

	    return "Ensure that all areas of the hospital are cleaned and sanitized regularly.";
	  }
	@Override
	  public String followSafetyProtocols() {
	  
	    return "Staff should follow all safety protocols to keep patients and staff members safe.";
	  }
	@Override
	  public String respectPatientPrivacy() {

	    return " respect patient privacy and only share information on a need-to-know basis.";
	  }
	@Override
	  public String adhereToEthicalStandards() {

	    return " adhere to strict ethical standards to ensure the highest quality of care for our patients.";
	  }
	@Override
	  public String provideEffectiveTreatment() {

	    return " medical professionals should use evidence-based practices to provide effective treatment for our patients.";
	  }
	@Override
	  public String communicateClearly() {

	    return "communicate clearly with patients and their families to ensure that they understand their treatment options and care plan.";
	  }
	@Override
	  public String managePatientRecords() {

	    return "maintain accurate and complete patient records to ensure continuity of care.";
	  }
	@Override
	  public String handleMedicalEmergencies() {
	 
	    return " staff should be trained to handle medical emergencies and respond quickly to any urgent situations.";
	  }
	@Override
	  public String ensurePatientComfort() {

	    return "ensure patient comfort by providing a clean, safe, and welcoming environment.";
	
	  }
}
