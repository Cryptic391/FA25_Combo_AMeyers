import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Total_Calculation {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	
	File items = createFile("items.txt");
	
	double sum = readFile(items);
	double tax = sum * 0.053;
	double tot = sum + tax;
	System.out.println(sum);
	System.out.println(tax);
	System.out.println(tot);
	
	File total = createFile("total.txt");
	
	writeFile(total, sum);
	appendTo(total, tax);
	appendTo(total, tot);
	
	}
	
	private static double readFile(File myFile) {
		double total = 0;
		try (Scanner myReader = new Scanner(myFile)) {
		      while (myReader.hasNextDouble()) {
		        total += myReader.nextDouble();
		      }
		    } 
			catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
		return total;
	}
	
	
	private static void writeFile(File name, double sum) {
		try {
			FileWriter myWriter = new FileWriter(name);
			String sSum = String.format("%.2f", sum);
			myWriter.write(sSum);
			myWriter.close();
			System.out.println("Write successful.");
		}
		catch (IOException e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
	}
	
	
	private static void appendTo(File items, double num) {
		try {
			FileWriter myWriter = new FileWriter(items , true);
			myWriter.write("\n");
			String sNum = String.format("%.2f", num);
			myWriter.write(sNum);
			myWriter.close();
			System.out.println("Appended successful.");
		}
		catch (IOException e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
	}
	

	private static File createFile(String fileName) {
		try {
			File myFile = new File(fileName);
			if(myFile.createNewFile())
			{
				System.out.println("File Created!");
			}
			else {
				System.out.println("File " + myFile.getName() + " already exitsts.");
			}
			return myFile;
		} 
		catch (IOException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
		return null;
	}
	
	
}
