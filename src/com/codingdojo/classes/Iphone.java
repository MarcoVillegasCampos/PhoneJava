package com.codingdojo.classes;

public class Iphone extends Phone implements Ringable{
    
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	
    @Override
    public String ring() {
       String Ringtone=String.format(("Iphone %s says: %s"),getVersionNumber(),getRingTone());
       return Ringtone;
       
    }
    @Override
    public String unlock() {
        String message= "Unlocking via facial recognition";
        
        return message; 
        
    }
    @Override
    public void displayInfo() {
     	String info=String.format(("Iphone %s from %s"),getVersionNumber(),getCarrier());
    	System.out.println(info);        
    }
}
