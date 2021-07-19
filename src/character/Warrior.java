package character;

public class Warrior extends Character implements Movable{
	

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
			System.out.println("I'll crush you with my "+weapon+" ! \n") ;
		}
	}
	
	
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println( "[" +this.name+"] : moves right like a bad boy.");
	}


	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println( "[" +this.name+"] : moves left like a bad boy.");
	}


	@Override
	public void moveBack() {
		// TODO Auto-generated method stub
		System.out.println( "[" +this.name+"] : moves back like a bad boy.");
	}


	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println( "[" +this.name+"] : moves forward like a bad boy.");
	}

}
