package com.codingdojo.phone;

// this is making the class interface that every one can follow the rules similar manner
//
public interface Ringable {

	default String ring() {
		System.out.println("bell is ringing helo helooo");
		return "";
	}

	default String unlock() {
		System.out.println("you are unlocking the phone");
		return "";
	}

}
