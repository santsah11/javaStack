package com.codingdojo.master;

public class Wizard extends Human {
	 int health =50;
	 int intelligence =8;
	 
	 public void heal(Human player) {
		 player.health = player.health + this.intelligence;
		 System.out.println(health);
		 
	 }
	 
	 public void fireball(Human player) {
		 player.health = player.health- intelligence*3;
		 System.out.println(health);
	 }
}