
public class Weapon {
	private String name;
	private int damageDie;
	
	
	
	public Weapon() {
		super();
		this.name = "";
		this.damageDie = 0;
	}
	
	public Weapon(String name, int dmgDie) {
		super();
		this.name = name;
		this.damageDie = dmgDie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamageDie() {
		return damageDie;
	}

	public void setDamageDie(int damageDie) {
		this.damageDie = damageDie;
	}

	@Override
	public String toString() {
		return "Weapon Name: " + name + "\nDamage Die: " + damageDie;
	}
	
	
	
	
}
