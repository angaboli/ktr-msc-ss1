package warrior;

import character.Character;


public class Warrior extends Character{
	
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected final String RPGClass= "Warrior";

	public Warrior(String name, String RPGClass) {
		super(name, RPGClass);
		this.life = 100;
		this.strength = 10;
		this.agility = 8;
		this.wit = 3;
	}
	
	public void attack(String weapon) {
		
		if(weapon == "hammer" || weapon == "sword") {
			
			System.out.println("["+this.name+"]: Rrrrrrrrrr...") ;
			System.out.println("I'll crush you with my ["+weapon+"] ! \n") ;
		}
	}

}