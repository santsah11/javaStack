package com.codingdojo.models;



public class animal {
	private	String name ;
	private	String breed ;
	private	int weight;
	
public animal() {};
public animal(String name, String breed, int weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
	
public String create() {
	return " Hello My name is";
}
}
