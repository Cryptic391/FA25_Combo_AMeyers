import java.util.Scanner;

public class Recursing {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 10;
		countDown(n);
		System.out.println();
		int factN = factorial(n);
		System.out.println(factN);
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println(factorial(i));	
		}
		int fibNum = fibonacci(n);
		String another = "y";
		while(another.equals("y")) {
			System.out.println("Enter the fib level you want to go to");
			fibNum = input.nextInt();
			for (int i = 0; i < fibNum; i++) {
				System.out.print(fibonacci(i)+ ", ");
				if( i % 7 == 0 ) {
					System.out.println();
				}
			}
			System.out.println("Again?");
			another = input.next();
		}

	}

	private static int fibonacci(int n) {
		if(n < 1)
		{
			System.out.println("Please use positive integers only");
			return 0;
		}
		if(n ==1 || n == 2) {
			return 1;			
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	
	private static int factorial(int n) {
		if(n == 0)
			return 1; // base case is when the looping stops
		int recurse = factorial(n-1);
		int result = n * recurse;				
		return result;
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
	
	
	private static void countDown(int n) {
		if(n == 0) {
			System.out.println("Blast off");
		}
		else {
//			countDown(n-1);		if here it runs in reverse, but at bottom it runs normally
			System.out.println(n);
			countDown(n-1);
		}
		
	}

	
}
