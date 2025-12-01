import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		
		System.out.print("Enter your characters name: ");
		String name = input.next();
		
		
		setStats(stats, Player);
		int[] selStats = {Player.getStr(), Player.getDex(), Player.getCon(), Player.getIntel(), Player.getWis(), Player.getCha()};
		int[] statMods = {Player.getStrM(), Player.getDexM(), Player.getConM(), Player.getIntelM(), Player.getWisM(), Player.getChaM()};
		System.out.print("Your selected stats: ");
		printStats(selStats);
		
		
		
		System.out.println("\nWould you like to save your character? (y/n)");
		String save = input.next();
		if(save.equals("y")) {
			File myFile = createFile(name);
			writeFile(name);
			appendTo(name, statList, selStats, statMods);
		}
		
	}
	
	private static void appendTo(String name,String[] statlist, int[] selStats, int[] statMods) {
		try {
			FileWriter myWriter = new FileWriter(name , true);
			for(int i =0; i <6;i++) {
				myWriter.write("\n");
				myWriter.write(statlist[i] + ":" + selStats[i] + "  Mod:" + statMods[i]);
			}
			myWriter.close();
			System.out.println("Appended successful.");
		}
		catch (IOException e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
	}
	
	private static void writeFile(String name) {
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write("Character name: " + name);
			myWriter.close();
			System.out.println("Write successful.");
		}
		catch (IOException e) {
			System.out.println("Write failed.");
			e.printStackTrace();
		}
	}
	
	private static File createFile(String name) {
		try {
			File myFile = new File(name);
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
		player.setStrM(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[0] + ": " + player.getStr() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[1] + " to that selection: ");
		selection = input.nextInt();
		player.setDex(stats[selection]);
		player.setDexM(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[1] + ": " + player.getDex() + "\n");
		printStats(stats);

		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[2] + " to that selection: ");
		selection = input.nextInt();
		player.setCon(stats[selection]);
		player.setConM(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[2] + ": " + player.getCon() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[3] + " to that selection: ");
		selection = input.nextInt();
		player.setIntel(stats[selection]);
		player.setIntelM(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[3] + ": " + player.getIntel() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[4] + " to that selection: ");
		selection = input.nextInt();
		player.setWis(stats[selection]);
		player.setWisM(stats[selection]);
		stats[selection] = 0;
		selections.remove(Integer.valueOf(selection));
		System.out.print(statList[4] + ": " + player.getWis() + "\n");
		printStats(stats);
		
		System.out.print("\nEnter ");
		System.out.print(selections);
		System.out.print(" to set your " + statList[5] + " to that selection: ");
		selection = input.nextInt();
		player.setCha(stats[selection]);
		player.setChaM(stats[selection]);
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

