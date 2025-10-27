
public class Cat extends Animal{
	private boolean longhair;
	private boolean bobtail;
	
	
	public Cat() {
		super();
		this.longhair = true;
		this.bobtail = false;
	}
	
	public Cat(int height, double weight, String name, boolean longhair, boolean bobtail) {
		super(height, weight, name);
		this.longhair = longhair;
		this.bobtail = bobtail;
	}

	
	public boolean isLonghair() {
		return longhair;
	}
	public void setLonghair(boolean longhair) {
		this.longhair = longhair;
	}
	public boolean isBobtail() {
		return bobtail;
	}
	public void setBobtail(boolean bobtail) {
		this.bobtail = bobtail;
	}

	@Override
	public String makeNoise() {
		return "Meow Meow Meow";
	}
	
	@Override
	public String toString() {
		return "Cat" + "\nName: " + super.getName() + "\nLonghair: " + longhair + "\nBobtail: " + bobtail + "\nHeight: " + super.getHeight() 
			+ " cm \nWeight: " + super.getWeight() + " kg";
	}
	

	
	
	

}
