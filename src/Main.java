

import character.Character;
import mage.Mage;
import warrior.Warrior;

public class Main {

	public static void main(String[] args) {
		
		Character mage = new Mage("Robert", "Mage") ;
		System.out.println( mage.getName()) ;
		System.out.println( mage.getLife()) ;
		System.out.println( mage.getAgility()) ;
		System.out.println( mage.getStrength()) ;
		System.out.println( mage.getWit()) ;
		System.out.println( mage.getRPGClass()) ;
		mage.attack("my weapon ") ;
		
		Character warrior = new Warrior("Jean -Luc", "Warrior") ;
		warrior.attack("hammer") ;
		mage.attack("magic") ;


	}

}
