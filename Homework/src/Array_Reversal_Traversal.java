import java.util.Scanner;

public class Array_Reversal_Traversal {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums = fillArray();
		printArray(nums);
	}

	private static void printArray(int[] nums) {	
		int index = 99;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == -1) {
				index = i-1;
				break;
			}
		}
		for (int i = index; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

	private static int[] fillArray() {
			int[] nums = new int[100];
			for(int i = 0;i < 100; i++) {
				System.out.print("Enter number " + (i+1) + " : ");
				nums[i] = input.nextInt();
				if(nums[i] == -1) break;
			}
			return nums;
		}
		
	}

