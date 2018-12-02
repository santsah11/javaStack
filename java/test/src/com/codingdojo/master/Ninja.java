package com.codingdojo.master;

public class Ninja extends Human {
 int stealth =10;
 
 public void steal(Human jeremy) {
	 jeremy.health =jeremy.health - this.stealth;
	 this.health   = this.health + stealth;
	 System.out.println( "Geeting from the jeremy and adding to the Ninaj Because "+ health);
 }
 
// public void runAway() {
//	 health = health-10;
//	 System.out.println(health);
// }
}
