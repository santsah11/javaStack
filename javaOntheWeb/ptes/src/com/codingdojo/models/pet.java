package com.codingdojo.models;

public interface pet {

	default String showAffection() {
		System.out.println("you can write your own state");
		return "";
	}
}
