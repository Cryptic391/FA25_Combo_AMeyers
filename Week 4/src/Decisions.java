import java.util.Scanner;

public class Decisions {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		//if statements
			//x == y -> does x = y
			//x != y -> is x not equal to y
			//x > y -> is x greater than y
			//x < y -> is x less than y
			//x >= y -> is x greater than or equal to y
		int x = 10;		
		
		if(x % 2 == 0) //% checks if there is a remainder
		{
			System.out.println("x is even");
		}
		else
		{
			System.out.println("x is odd");
		}
		
		if(x > 0)
		{
			System.out.println("x is positive");
		}
		else if (x < 0)
		{
			System.out.println("x is negative");
		}
		else
		{
			System.out.println("x is zero");
		}		

		
		
		System.out.println("Enter a number from 1 to 4");
		int num = input.nextInt();
		if(num == 1)
		{
			System.out.println("One");
		}
		else if (num == 2)
		{
			System.out.println("Two");
		}
		else if (num == 3)
		{
			System.out.println("Three");
		}
		else  
		{
			System.out.println("Four");
		}
		
		switch(num) //easier way of doing if and else if statements when more than 3 are needed
		{
			case 1:
				System.out.println("One");
				break;	// need break or will continue down the case list
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;				
		}
		
		
		
		String food = "banana";
		
		switch(food) //multiple cases can be used as or statements
		{
			case "apple":	//if food is apple, banana or cherry print Fruit!, but if food is broccoli, carrot or peas print Veggie! 
			case "banana":
			case "cherry":
				System.out.println("Fruit!");
				break;
			case "broccoli":
			case "carrot":
			case "peas":
				System.out.println("Veggie!");
				break;		
		}
		
		
		
		//if(x > 0 && x < 10) // x is greater than 0 and also less than 10
		// x < 0 || x > 10
			// double lines || is an or statement
		// !(x > 0)		! is a not statement
		
		
	
		x = 4;
		int y = 0;
		
		if(x == 0)
		{
			if(y == 0)
			{
				System.out.println("Both x and y are 0");
			}
		}
		if(x == 0 && y == 0) System.out.println("Both x and y are 0");	//both statements do the same thing, this is simplified into one line	//&& is an and statement, checking if a and b are 0
		if(x == 0|| y == 0) System.out.println("Either x or y are 0");	//checks if either x or y are equal to 0
				
		//!(a && b) is the same as !a || !b		// not (a and b) == not a or not b
		//!(a || b) is the same as !a && !b		// not (a or b) == not a and not b
		
		
		
		boolean flag;
		flag = true;
		
		
		
		System.out.println(isSingleDigit(10));
		int userNum = getNum();
		while(!isSingleDigit(userNum))
		{
			System.out.println("That is not a single digit.");
			userNum = getNum();
		}
		System.out.println("Great job following instructions.");
		
		
		
	}
	
	
	private static int getNum()
	{
		System.out.println("Enter a single digit number");
		int userNum = input.nextInt();
		return userNum;
	}
	

	public static boolean isSingleDigit(int num)
	{
		return num > -10 && num < 10;
	}
	
	
}
