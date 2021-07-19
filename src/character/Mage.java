package character;

public class Mage extends Character implements Movable {
	
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
			System.out.println("I'll crush you with my "+weapon+" ! \n") ;
		}
	}


	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return "[" +this.name+"] : moves right";
	}


	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return "[" +this.name+"] : moves left";
	}


	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return "[" +this.name+"] : moves back";
	}


	@Override
	public String moveForward() {
		// TODO Auto-generated method stub
		return "[" +this.name+"] : moves forward";
	}

	

}
