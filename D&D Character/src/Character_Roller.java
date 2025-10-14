
public class Character_Roller {
	int str = rollChar();
	int strMod = findMod(str);
	int dex = rollChar();
	int dexMod = findMod(dex);
	int con = rollChar();
	int conMod = findMod(con);
	int intl = rollChar();
	int intlMod = findMod(intl);
	int wis = rollChar();
	int wisMod = findMod(wis);
	int cha = rollChar();
	int chaMod = findMod(cha);
	
	int[] stats = {str,dex,con,intl,wis,cha};
	
	public Character_Roller() {
		super();
		this.str = str;
		this.strMod = strMod;
		this.dex = dex;
		this.dexMod = dexMod;
		this.con = con;
		this.conMod = conMod;
		this.intl = intl;
		this.intlMod = intlMod;
		this.wis = wis;
		this.wisMod = wisMod;
		this.cha = cha;
		this.chaMod = chaMod;
	}

	private String recType() {
		int high = 0;
		String ret = "";
		for(int i = 0; i < stats.length; i++) {
			if(stats[i] > stats[high]) 
				high = i;
		}
		switch (high) {
			case 0: 
				ret = "Strength";
				break;
			case 1: 
				ret = "Dexterity";
				break;
			case 2: 
				ret = "Constitution";
				break;
			case 3: 
				ret = "Inteligence";
				break; 
			case 4: 
				ret = "Wisdom";
				break;
			case 5: 
				ret = "Charisma";
				break;
		}
		return ret;
	}
	
	
	private int rollChar() {
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





	
	
	private int findMod(int stat) {
		return ((stat-10)/2);	
	}
	
	
	@Override
	public String toString() {
		return "Strength: " + str + "\n[" + strMod + "]" + "\nDexterity: " + dex +  "\n[" + dexMod + "]" + "\nConstitution: " + con + "\n[" + conMod + "]"  + 
	
				"\nInteligence: " + intl +   "\n[" + intlMod + "]" + "\nWisdom: " + wis +  "\n[" + wisMod + "]"  +  "\nCharisma: " + cha +  "\n[" + chaMod + "]\n" + "Best Stat: " + recType();
	}
	
	
}
