import java.util.ArrayList;
import java.util.Scanner;


public class Stats {
	int str;
	int dex;
	int con;
	int intel;
	int wis;
	int cha;
	
	int strM = findMod(str);
	int dexM = findMod(dex);
	int conM = findMod(con);
	int intelM = findMod(intel);
	int wisM = findMod(wis);
	int chaM = findMod(cha);
	
	
	public Stats() {
		super();
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		this.strM = strM;
		this.dexM = dexM;
		this.conM = conM;
		this.intelM = intelM;
		this.wisM = wisM;
		this.chaM = chaM;
	}




	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getStrM() {
		return strM;
	}

	public int getDexM() {
		return dexM;
	}

	public int getConM() {
		return conM;
	}

	public int getIntelM() {
		return intelM;
	}

	public int getWisM() {
		return wisM;
	}

	public int getChaM() {
		return chaM;
	}
	public void setStrM(int str) {
		this.strM = findMod(str);
	}

	public void setDexM(int dex) {
		this.dexM = findMod(dex);
	}

	public void setConM(int con) {
		this.conM = findMod(con);
	}

	public void setIntelM(int intel) {
		this.intelM = findMod(intel);
	}

	public void setWisM(int wis) {
		this.wisM = findMod(wis);
	}

	public void setChaM(int cha) {
		this.chaM = findMod(cha);
	}


	private int findMod(int stat) {
		return ((stat-10)/2);	
	}




	
	
	
}
