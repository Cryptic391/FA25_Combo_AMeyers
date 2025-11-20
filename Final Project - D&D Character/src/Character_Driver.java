import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

public class Character_Driver {

	public static Scanner input = new Scanner(System.in);
	public static String[] statList = {"Strength", "Dexterity", "Constitution", "Intelligence","Wisdom","Charisma"};
	public static void main(String[] args) {
	
	
		Stats Player = new Stats();
		int[] stats = new int[6];
		
		for(int i=0;i<6;i++) {
			stats[i] = rollChar();
		}
		
		setStats(stats, Player);
		int[] selStats = {Player.getStr(), Player.getDex(), Player.getCon(), Player.getIntel(), Player.getWis(), Player.getCha()};
		System.out.print("Your selected stats: ");
		printStats(selStats);
		
	}
	
	
	static void setStats(int[] stats, Stats player) {
		System.out.println("Time to set your stats.");
		int selection;
		printStats(stats);
		ArrayList<Integer> selections = new ArrayList<Integer>();
		for(int i =0;i<6;i++) {
			selections.add(i);
		}

		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[0] + " to that selection: ");
		selection = input.nextInt();
		player.setStr(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[0] + ": " + player.getStr() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[1] + " to that selection: ");
		selection = input.nextInt();
		player.setDex(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[1] + ": " + player.getDex() + "\n");
		printStats(stats);

		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[2] + " to that selection: ");
		selection = input.nextInt();
		player.setCon(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[2] + ": " + player.getCon() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[3] + " to that selection: ");
		selection = input.nextInt();
		player.setIntel(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[3] + ": " + player.getIntel() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[4] + " to that selection: ");
		selection = input.nextInt();
		player.setWis(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[4] + ": " + player.getWis() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[5] + " to that selection: ");
		selection = input.nextInt();
		player.setCha(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[5] + ": " + player.getCha() + "\n");
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

