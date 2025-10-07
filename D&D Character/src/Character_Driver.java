import java.util.Scanner;

public class Character_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("What is your character's name?");
		String name = "bob";
		
//		System.out.println("How many Hit Points?");
		int hp = 5;
		
//		System.out.println("What is the Strength Score?");
		int str = 15;
		
//		System.out.println("What is the Armor Class?");
		int ac = 10;
		

		Character bob = new Character(hp,name,str,ac);
		Character monster = new Character();
		
		monster.setName("Bugbear");
		monster.setStrength(15);
		monster.setHealth(20);
		monster.setArmorClass(15);
		
		Weapon ax = new Weapon("Ax",28);

		bob.setWeapon("Ax",5);
		System.out.println(bob.toString());
		System.out.println();
		System.out.println(monster);
		
	}

}
