

import character.Character;
import character.Mage;
import character.Warrior;

public class Main {

	public static void main(String[] args) {
		
		Character mage = new Mage("Robert", "Mage") ;
		Character warrior = new Warrior("Jean -Luc", "Warrior") ;
		
		mage.attack("my weapon ") ;
		warrior.attack("hammer") ;
		mage.attack("magic") ;
		
		warrior.moveRight() ;
		warrior.moveLeft() ;
		warrior.moveBack() ;
		warrior.moveForward() ;
		mage.moveRight() ;
		mage.moveLeft() ;
		mage.moveBack() ;
		mage.moveForward() ;



	}

}
