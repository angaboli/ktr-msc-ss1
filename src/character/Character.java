/**
 * 
 */
package character;

/**
 * @author angab
 *
 */
public abstract class Character implements Movable {
	
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	protected final String RPGClass;
	
	
	public Character(String name, String RPGClass) {
		this.name = name;
		this.RPGClass = RPGClass;
		this.life = 50;
		this.agility = 2;
		this.strength = 2;
		this.wit = 2;
	}
	
	public abstract void attack(String weapon) ; 
	
	public abstract void unsheathe();

	public String getName() {
		return name;
	}


	public int getLife() {
		return life;
	}


	public int getAgility() {
		return agility;
	}


	public int getStrength() {
		return strength;
	}

	public int getWit() {
		return wit;
	}

	public String getRPGClass() {
		return RPGClass;
	}
	
	

}
