import java.util.Scanner;

public class InClassLoops {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sum = SumFor();
		System.out.println(sum);
		System.out.println();
		
		
		int terms = 10;
		ForFibonacci(terms);
		System.out.println();
		
		int rows = 7;
		rightTri(rows);
		System.out.println();
		
		
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



	private static void rightTri(int rows) 
	{
		for(int i = 1; i < rows + 1; i++)
		{
			for(int j = 1; j < i + 1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}



	private static void ForFibonacci(int terms) 
	{
		if(terms < 1)
		{
			System.out.println("Please use positive integers only");
			return;
		}
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.printf("Fibonacci sequence up to %d terms:", terms);
		System.out.println();
		
		if(terms == 1)
		{
			System.out.println(firstTerm);
			return;
		}
		
		System.out.print(firstTerm + ", " + secondTerm);
		for(int i = 2; i < terms; i++)
		{
			int nextTerm = firstTerm + secondTerm;
			System.out.print(", " + nextTerm );
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}
		System.out.println();
	}



	private static int SumFor() 
	{
		int sum = 0;
		for( int i =0; i < 10; i++)
		{
			sum+=i;
		}
		return sum;
	}
}
