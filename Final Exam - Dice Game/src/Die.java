import java.util.Random;

public class Die {
	static Random rand = new Random();
	int numSides;
	int value;
	
	
	public Die() {
		super();
		this.numSides = 6;
		this.value = -1;
	}
	
	public Die(int numSides, int value) {
		super();
		this.numSides = numSides;
		this.value = value;
	}
	
	public Die(int numSides) {
		this.value = 1;
	}
	
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	public static int roll(int numSides) {
		return rand.nextInt(numSides)+1;
	}
	
	public static int multiRoll(int count,int sides) {
		int result = 0;
		for(int i =0; i < count;i++) {
			result += rand.nextInt(sides)+1;
		}
		return result;
	}
	
	
}
