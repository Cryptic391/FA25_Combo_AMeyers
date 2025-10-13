package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_7_6 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int num = input.nextInt();
		System.out.println("How many numbers in the array?");
		int count = input.nextInt();
		int[] nums = new int[count];
		for(int i = 0; i < count; i++) {
			System.out.printf("Enter number %d in the array: ",i+1);
			nums[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		arePrimeFactors(num,nums,count);
		

	}
	private static boolean arePrimeFactors(int num, int[] nums, int count) {
		int primeCount =0;
		int product = 1;
		for(int i = 0; i < nums.length; i++) 
		{
			if(isPrime(nums[i])) 
			{
				primeCount ++;
			}
			product *= nums[i];
			System.out.println(product);
		}
		if(primeCount == count) {
			System.out.println("The numbers are prime.");
			if(product == num) {
				System.out.println("The numbers in the array are prime factors of " + num + ".");
			}
			else
				System.out.println("The numbers in the array are not prime factors of " + num + ".");
		}
		else {
			System.out.println("The numbers are not prime.");
		}
		
		return false;
		
		
		
	}
	private static boolean isPrime(int nums) {
		if(nums <= 1) {
			return false;
		}
		for(int i = 2; i < nums; i++) {
			if(nums % i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
