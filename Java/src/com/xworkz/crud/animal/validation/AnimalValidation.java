package com.xworkz.crud.animal.validation;

public class AnimalValidation {
	
    public static boolean validString(String value) {
    	if(value!=null && !value.isEmpty() && value.length()>3 && value.length()<30) {
    		return true;
    	}
    	return false;
    }
    
    public static boolean validInt(int value) {
    	if(value>0) {
    		return true;
    	}
    	return false;
    }
    public static boolean validDouble(double value) {
    	if(value>0) {
    		return true;
    	}
    	return false;
    } 
    
    public static boolean validFlag(boolean...flag) {
    	for(int index=0;index<flag.length;index++) {
    		boolean element = flag[index];
    		if(!element) {
    			return false;
    		}
    	}
    	return true;
    }
    
    

}
