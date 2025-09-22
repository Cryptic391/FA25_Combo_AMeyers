import java.util.Scanner;

public class BottlesOfBeer {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of bottles to start with: ");
		int bottles = input.nextInt();
		beerBottles(bottles);

	}

	private static void beerBottles(int bottles)
	{
		int bot = bottles;
		while(bottles > 2)
		{
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
			bottles -= 1;			
			System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");
			System.out.println();
		}
		System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
		bottles -= 1;
		System.out.println("Take one down and pass it around, " + bottles + " bottle of beer on the wall.");
		System.out.println();
		System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
		System.out.println();
		System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
		System.out.println("Go to the store and buy some more, " + bot + " bottles of beer on the wall.");
	}
}

