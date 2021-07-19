package mage;

import character.Character;

public class Mage extends Character {
	
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected final String RPGClass= "Mage";

	public Mage(String name, String RPGClass) {
		super(name, RPGClass);
		this.life = 70;
		this.strength = 3;
		this.agility = 10;
		this.wit = 10;
	}
	
	public void attack(String weapon) {
		
		if(weapon == "magic" || weapon == "wand") {
			
			System.out.println("["+this.name+"]: Rrrrrrrrrr...") ;
			System.out.println("I'll crush you with my ["+weapon+"] ! \n") ;
		}
	}
	
	

}
