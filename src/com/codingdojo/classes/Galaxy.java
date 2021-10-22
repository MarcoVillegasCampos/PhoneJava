package com.codingdojo.classes;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	 String Ringtone=String.format(("Galaxy %s says: %s"),getVersionNumber(),getRingTone());
         return Ringtone;
    }
    @Override
    public String unlock() {
    	 String message= "Unlocking via finger print";
         
         return message; 
    }
    @Override
    public void displayInfo() {
    	String info=String.format(("Galaxy %s from %s"),getVersionNumber(),getCarrier());
    	System.out.println(info);
    	
    }
}
