
public class Player {
	String name;
	int totalDice;
	
	
	public Player() {
		super();
		this.name = "none";
		this.totalDice = -1;
	}
	
	public Player(String name, int totalDice) {
		super();
		this.name = name;
		this.totalDice = totalDice;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalDice() {
		return totalDice;
	}

	public void setTotalDice(int totalDice) {
		this.totalDice = totalDice;
	}

	@Override
	public String toString() {
		return "Player " + name + " rolled " + totalDice;
	}
	
	
	
}
