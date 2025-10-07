import java.util.Scanner;

public class n_Bottles {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many bottles?");
		int bottles = input.nextInt();
		BoB(bottles);
		

	}
	private static void BoB(int bottles) {
		if(bottles == 0) {
			System.out.printf("No bottles left to grab!%n");
			return;
		}
		else if(bottles == 1) {
			System.out.printf("1 bottle of beer on the wall, 1 bottle of beer.%n" + "Take one down, pass it around, no bottles of beer on the wall.%n%n");
			BoB(bottles -1);
		}
		else if(bottles == 2) {
			System.out.printf("2 bottles of beer on the wall, 2 bottles of beer.%n" + "Take one down, pass it around, 1 bottle of beer on the wall.%n%n");
			BoB(bottles -1);
		}
		else {
			System.out.printf("%d bottles of beer one the wall, %d bottles of beer.%n", bottles, bottles);
			System.out.printf("Take one down, pass it around, %d bottles of beer on the wall.%n%n", bottles-1);
			BoB(bottles-1);
		}
	}

}
