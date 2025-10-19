import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Triangles {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String another = "y";
		
		while(another.equalsIgnoreCase("y")) {
			
			System.out.print("Enter size: ");
			int rows = input.nextInt();
			while(rows<1 || rows>50) {
				System.out.println("Size must be between 1 and 50");
				System.out.print("Enter size: ");
				rows = input.nextInt();
			}

			System.out.print("Enter fill character: ");
			char fill = input.next().charAt(0);
		
			printTri(rows,fill);

			System.out.println("Would you like another? (y/n)");
			another = input.next();
		}
	}
	
	
	
	private static void printTri(int rows, char fill) {
		
		
		for(int rowNum = 0; rowNum < rows+1; rowNum++) {
			for(int spaces = rowNum; spaces < rows;spaces++){	
				System.out.print(" ");
			}
			for(int inRow = 0; inRow < rowNum; inRow++) {
				System.out.print(fill + " ");
			}
			System.out.println();
		}
			
	}
}

