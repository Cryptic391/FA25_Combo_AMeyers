package Week5Loops;

import java.util.Scanner;

public class Right_Angle_Loop {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
		rightTri(rows);
		System.out.println();
	}
	
	private static void rightTri(int rows) {
		for(int i = 1; i < rows + 1; i++)
		{
			for(int j = 1; j < i + 1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}	
	}
}
