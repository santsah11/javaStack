package com.codingdojo.models;

public class cat extends animal implements pet {

	public cat(String name, String breed, int weight) {
		super(name, breed, weight);
	
	}
		public String showAffection() {
		System.out.println("printing the show affection method here" + this.getBreed());
		this.getName();
		return this.getBreed();
	}
		public void display() {
			System.out.println(this.getWeight());
		}
}
