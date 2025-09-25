package Week5Loops;

import java.util.Scanner;

public class While_Fibonacci {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number of terms: ");
		int terms = input.nextInt();
		WhileFibonacci(terms);
		System.out.println();
	}
	
	private static void WhileFibonacci(int terms) {
		if(terms < 1)
		{
			System.out.println("Please enter a positive number of terms.");
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
		int i = 2;
		while(i < terms)
		{
			int nextTerm = firstTerm + secondTerm;
			System.out.print(", " + nextTerm );			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			i++;			
		}
		System.out.println();
	}
}