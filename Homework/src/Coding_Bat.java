import java.util.Scanner;

public class Coding_Bat {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String a = "Hiab";
		String b = "ab";
		a.toLowerCase();
		b.toLowerCase();
//		System.out.println(endOther(a, b));
//		System.out.println(a.substring(b.length()-1,a.length()));
		int diff = Math.abs(a.length()-b.length()-1);
		System.out.println((a.substring(b.length()-diff,a.length())));
		for(int i = 0; i<b.length();i++) {
			if(b == (a.substring(b.length()-1,a.length())))
			{
				System.out.println("true");
			}
		}
	}

	public static boolean endOther(String a, String b) {
		int diff = Math.abs(a.length() - b.length());
		a.toLowerCase();
		b.toLowerCase();
		if (a.length() > b.length()) {
			for (int i = 0; i < a.length() - b.length(); i++)	
			{

			}
		} 
		else {

			for (int i = 0; i < b.length() - a.length(); i++)	
			{

			}
		}
		return false;
	}
}
