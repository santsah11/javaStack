package com.codingdojo.phone;

public class Iphone extends Phone implements Ringable {
	
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
     return "Iphone is ringign";
    }
    
    @Override
    public String unlock() {

       return "Unlocking the phone via facial recongniation";
    }
    @Override
    public void displayInfo() {
    	this.getBatteryPercentage();
    	this.getVersionNumber();
    	this.getCarrier();
                 
    }
}

