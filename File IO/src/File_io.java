import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_io {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file you would like to work on?");
		String fileName = input.next();
		input.nextLine(); //clears input
		File myFile = createFile(fileName);
		
		
		System.out.println("What you want to write?");
		String write = input.nextLine();
		writeFile(fileName, write);
		
		
		System.out.println("What you want to add to the file");
		String write2 = input.nextLine();	
		appendTo(fileName, write2);
		
		
		readFile(myFile);
		deleteFile(myFile);
		
		}

	
	private static void deleteFile(File myFile) {
		if(myFile.delete()) {
			System.out.println(myFile.getName() + " was deleted.");
		}
		else {
			System.out.println(myFile.getName() + " failed to delete.");
		}
	}

	
	private static void readFile(File myFile) {
		System.out.println("File: " + myFile);
		try (Scanner myReader = new Scanner(myFile)) {
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		    } 
			catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
	}

	
	private static void appendTo(String name, String strToAppend) {
		try {
			FileWriter myWriter = new FileWriter(name , true);
			myWriter.write("\n");
			myWriter.write(strToAppend);
			myWriter.close();
			System.out.println("Appended successful.");
		}
		catch (IOException e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
	}

	
	private static void writeFile(String name, String strToWrite) {
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write(strToWrite);
			myWriter.close();
			System.out.println("Write successful.");
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