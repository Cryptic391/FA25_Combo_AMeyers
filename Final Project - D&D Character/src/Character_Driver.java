import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

public class Character_Driver {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	
		Stats Player = new Stats();
		int[] stats = new int[6];
		
		for(int i=0;i<6;i++) {
			stats[i] = rollChar();
		}
		
		setStats(stats, Player);
		
		
	}
	
	
	static void setStats(int[] stats, Stats player) {
		System.out.println("Time to set your stats.");
		printStats(stats);
		System.out.print("\nEnter a number 0-5 to set your Strength to that number: ");
		int distro = input.nextInt();
		player.setStr(stats[distro]);
		int str = player.getStr();
		System.out.print("Strength: " + str);
		stats[distro] = 0;
		System.out.println();
		printStats(stats);
		System.out.print("\nEnter a number 0-5 to set your Dexterity to that number: ");
		distro = input.nextInt();
		player.setDex(stats[distro]);
		int dex = player.getDex();
		System.out.print("Dexterity: " + dex);
		stats[distro] = 0;
		System.out.println();
		printStats(stats);
		
	}


	private static void printStats(int[] stats) {
		for(int j=0;j<6;j++) {
			System.out.print(stats[j] + " ");
		}
		
	}


	private static int rollChar() {
		int sum = 0;
		int low = 6;
		for(int i =0; i < 4; i++) {
			int roll = Dice.roll(6);
			while (roll == 1) {
				roll = Dice.roll(6);
			}
			sum += roll;
			if(roll < low) {
				low = roll;
			}
		}
		sum -= low;
		return sum;
	}
}

