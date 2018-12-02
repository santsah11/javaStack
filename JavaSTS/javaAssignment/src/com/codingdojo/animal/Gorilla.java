package com.codingdojo.animal;

public class Gorilla extends Mammal {
	
public void	eatBananas(){
		System.out.println("Gorila ate 10 bananas and increeease the inergy");
		energyLevel =energyLevel+10;
		System.out.println(energyLevel);
	}
public void	climb() {
		
	System.out.println("climed the ttree and decrease the enery by 10");
	energyLevel= energyLevel-10;
	System.out.println(energyLevel);
	}
public void throwSomething() {
	
	System.out.println("Gorila has thrown something");
	energyLevel= energyLevel-5;
	System.out.println(energyLevel);
}
}
