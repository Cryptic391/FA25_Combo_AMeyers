import java.util.Scanner;
public class String_Sorting {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number of Strings: ");
		int count = input.nextInt();
		String[] strings = fillStrings(count);
		
		alphabetical(strings);
		System.out.println("\nSorted: ");
		System.out.println(printArray(strings));
		
		notAlphabet(strings);
		System.out.println("\nReverse Sorted: ");
		System.out.println(printArray(strings));
	}
	
	
	private static void notAlphabet(String[] strings) {
		for (int i=0; i<strings.length-1; i++) {
		    for (int j=1; j<strings.length-i; j++) {
		      if (strings[j-1].compareTo(strings[j])<0) {
		    	  swap(strings, j-1, j);
		      } 
		    }
		}
		
	}


	private static void alphabetical(String[] strings) {
		for (int i=0; i<strings.length-1; i++) {
		    for (int j=1; j<strings.length-i; j++) {
		      if (strings[j-1].compareTo(strings[j])>0) {
		    	  swap(strings, j-1, j);
		      } 
		    }
		}
	}
	
	private static void swap(String[] strings,int i ,int j) {
		String temp = strings[i];
		strings[i] = strings[j];
		strings[j] = temp;		
	}
	
	
	private static String printArray(String[] strings) {
			String str = "";		
			for (int i = 0; i < strings.length; i++) {
				if(i < strings.length -1)
					str += strings[i] + "\n";
				else
					str += strings[i];
			}
			return str;
	}
	
	
	private static String[] fillStrings(int count) {
		String[] strings = new String[count];
		for(int i = 0;i < count; i++) {
			System.out.print("Enter string " + (i+1) + " : ");
			strings[i] = input.next();
		}
		return strings;
	}
}