package com.codingdojo.phone;

public class PhoneTester {

	public static void main(String[] args) {
	Galaxy	s9=new Galaxy("s9", 100, "Tmobile", "ringig");
	
	

	System.out.println(s9.ring());
	System.out.println(s9.unlock());
	s9.displayInfo();
	


	}

}
