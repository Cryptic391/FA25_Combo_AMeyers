import java.util.Scanner;

public class Binary_Converter {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//456	4 in 100s	5 in 10s	6 in 1s
		//10^2		10^1	10^0
		
		//10111		1 in 16s	0 in 8s		1 in 4s		1 in 2s		1 in 1s
		//			16		+	0	 	+	4		+	2		+	1		= 		23
		
		//convert to binary		divide by 2 until remainder is 0
		// 23 / 2	11 r 1
		// 11 / 2	5 r 1
		// 5 / 2	2 r 1
		// 2 / 2	1 r 0
		// 1 / 2	0 r 1
		// read bottom to top for binary
		
		
		System.out.print("Enter number to convert: ");
		int num = input.nextInt();
		
		displayBin(num);
				
	}
	
	
	private static void displayBin(int num) {
		if(num > 0) {
			displayBin(num/2);
			System.out.print(num % 2);
		}		
	}

	
}
