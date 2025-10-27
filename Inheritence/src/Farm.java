
public class Farm {

	public static void main(String[] args) {
		Animal[] farm = new Animal[3];
		
		farm[0] = new Animal(66,24,"Jasper");
		farm[1] = new Dog(71,69, "Fido","German Shepard","Tan-Black");
		farm[2] = new Cat(15,12,"Peach", false, false);
		
//		System.out.println(ani);
//		System.out.println();
//		System.out.println(dog + "\n" + dog.makeNoise());
//		System.out.println();
//		System.out.println(cat + "\n" +  cat.makeNoise());
		
		for (Animal ani : farm) {
			System.out.println(ani);
			System.out.println(ani.makeNoise());
			System.out.println();
			
			
		}
		
	}

}
