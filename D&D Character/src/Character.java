
public class Character {
	private int health;
	private String name;
	private int strength;
	private int armorClass;
	private Weapon weapon;
	
	
	
	public Character() {	//default constructor
		super();
		this.health = 0;
		this.name = "";
		this.strength = 0;
		this.armorClass = 0;
	}
	
	
	public Character(int health, String name, int strength, int armorClass) {	//fields constructor
		super();
		this.health = health;
		this.name = name;
		this.strength = strength;
		this.armorClass = armorClass;
	}
	

	
	
	
	public Character(int health, String name, int strength, int armorClass, String wName, int wDamage) {
		super();
		this.health = health;
		this.name = name;
		this.strength = strength;
		this.armorClass = armorClass;
		this.weapon = new Weapon(wName,wDamage);
	}

	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String name, int damage) {
		this.weapon = new Weapon(name, damage);
	}
	
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getArmorClass() {
		return armorClass;
	}


	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}


	@Override
	public String toString() {
		return "Name: " + name + "\nHealth: " + health + "\nStrength: " + strength + "\nAC: "
				+ armorClass + "\n" + weapon;
	}
	
	
	
}
