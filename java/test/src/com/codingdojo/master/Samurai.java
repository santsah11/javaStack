package com.codingdojo.master;

public class Samurai extends Human {
public	int health=200;

 public void deathBlow(Human otherHuman)
 
 
 {
	 System.out.println("Other human got killed by samurai and reduce her health by half");
	 this.health = this.health/2;
	 System.out.println(this.health);
 }
 
 public void meditate() {
	 this.health = this.health + this.health/2;
	 System.out.print(this.health);
 }
}
