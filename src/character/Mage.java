package character;

public class Mage extends Character implements Movable {
	
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected final String RPGClass= "May the gods be with me.";

	public Mage(String name, String RPGClass) {
		super(name, RPGClass);
		this.life = 70;
		this.strength = 3;
		this.agility = 10;
		this.wit = 10;
		System.out.println(this.name +": " +this.RPGClass);
	}
	

	public void attack(String weapon) {
		
		if(weapon == "magic" || weapon == "wand") {
			
			System.out.println("["+this.name+"]: Rrrrrrrrrr...") ;
			System.out.println("I'll crush you with my "+weapon+" ! ") ;
		}
	}


	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println( this.name+" : moves right furtively.");
	}


	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println( this.name+" : moves left furtively.");
	}


	@Override
	public void moveBack() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" : moves back furtively.");
	}


	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println( this.name+" : moves forward furtively.");
	}

	@Override
	public void unsheathe() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "unsheathe his weapon.");
		
	}

	

}
