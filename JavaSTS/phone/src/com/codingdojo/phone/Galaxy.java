package com.codingdojo.phone;

public class Galaxy  extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	  @Override
	    public String ring() {
	        return "Galaxy phone is ringing zzzzzzzz";
	    }
	    @Override
	    public String unlock() {
	        return "Galxy phone only open with pattern Matching";
	    }
	
	@Override
	public void displayInfo() {
	
		System.out.println(this.getVersionNumber());
		System.out.println(this.getBatteryPercentage());
		System.out.println(this.getCarrier());
		
		this.setBatteryPercentage(50);
		System.out.println(this.getBatteryPercentage());
	}
	
}
