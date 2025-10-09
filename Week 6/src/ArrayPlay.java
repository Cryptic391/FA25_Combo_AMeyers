import java.util.Arrays;
import java.util.Random;

public class ArrayPlay {

	public static void main(String[] args) 
	{
		int[] counts = {1,2,3,4,5};
		double[] values;
		String words[] = {"hello", "world", "goodbye", "cruel","big","bad","contentious"};
		int index = findWord(words,"big");
				
		System.out.printf("Found %s at index %d. %n", words[index], index);
		
		words[index] = "bigger"; 
	
		index = findWord(words,"big");
		
		if(index > -1)
			System.out.printf("Found %s at index %d. %n", words[index], index);
		else
			System.out.println("Not found.");
		
		
		
		values = new double[10];
		for (int i = 0; i < values.length; i++)
		{
			values[i] = i;
		}
		double[] newVals = values;
		
		System.out.println(Arrays.toString(values));
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i]);
		}
		
		
		System.err.println(counts.length);
		
		System.out.println(counts[2]);
		
		counts[2] = 17;
		
		System.out.println(counts[2]);
		
		counts[2] -= 25;
		
		System.out.println(counts[2]);
		
		System.out.printf("%s %s %s %n", words[2],words[3],words[1]);
		
		words[3] += words[0];
		
		System.out.println(words[3].charAt(0));
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println();
			}
		
		
		
		int[] randoms = createRandArr(10);
		printArray(randoms);
		int average = arrAvg(randoms);
		System.out.printf("The average of these numbers is %d. %n", average);
				
		for(int num: randoms) {
			System.out.printf("%d, ",num);
		}
		
		System.out.println();
		
		for(String word: words) {
			System.out.printf("%s, ",word);
		}
		
		
		
		
		
		
		
	}

	private static int arrAvg(int[] randoms) {
		int total = 0;
		for (int i = 0; i < randoms.length; i++) {
			total += randoms[i];
		}		
		return total / randoms.length;		
	}

	private static void printArray(int[] randoms) {
		for (int i = 0; i < randoms.length; i++) {
			System.out.printf("Index %d is %d.%n",i, randoms[i]);
		}		
	}

	private static int[] createRandArr(int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100)+1;
		}		
		return arr;
	}

	private static int findWord(String[] words, String target) 
	{
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(target))
				return i;
		}
		return -1;		
	}
}
