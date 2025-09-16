import java.util.Scanner;

public class Bookwork {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x = 0;
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
		if( x % 2 == 0)
		{
			System.out.println("x is even");
		}
		else
		{
			System.out.println("x is odd");
		}
		
		
		
		
		System.out.println("Enter a number between 1 and 5.");
		int num = input.nextInt();
		String word;			
		switch(num)
		{
			case 1:
				word = "One";
				break;
			case 2:
				word = "Two";
				break;
			case 3:
				word = "Three";
				break;
			case 4:
				word = "Four";
				break;	
			case 5:
				word = "Five";
				break;
			default:
				word = "Unkown";
				break;
		}
		System.out.println(word);
		System.out.println();
		
		
		
		int n = num;	// initializer
		while(n > 0)	//when number of loops is unknown	//condition
		{
			System.out.println(n);
			n--;	//changer
		}
		System.out.println("Blast off!");	
		System.out.println();
				
		
		
		for(int i = num; i < 10; i ++)	//number of loops is known		//i += 3 will add 3 to i instead of just 1		//initializer & condition & changer
		{
			System.out.println("i equals " + i);
		}
		
		
		
		for(int i =0; i < 10; i ++)		//adds 10 blank lines to the console for spacing
		{
			System.out.println();
		}
		
		
		
		System.out.println("Enter the number of column for the times table.");
		int cols = input.nextInt();
		
		System.out.println("Enter the number of rows for the times table.");
		int rows = input.nextInt();
		
		for(int i = 1; i <= rows; i ++)
		{
			for(int j = 1; j <= cols; j ++)
			{
				System.out.printf("%4d", (i * j));
			}
			System.out.println();
		}
		
		
		
		for(char c = 'A', count = 0; c <= 'z'; c++, count ++)	//has 2 variables in loop, adds 1 to both variables, runs while c is less than or equal to z 
		{
			if (count %10 == 0)		//Divide count by 10, if the remainder is 0 loop
			{
				System.out.println();
			}
			System.out.print(c + " ");					
		}
		System.out.println("Done");
		
		
		
		
		
		
	}

}
