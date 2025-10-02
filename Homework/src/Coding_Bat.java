import java.util.Scanner;

public class Coding_Bat {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String str = "azbcppp";
		String nStr = "";
		if (str.length() < 3) {
			System.out.println(str);
		} 
		else {
			int a = str.indexOf("z");
			int b = str.indexOf("p");
			if (str.indexOf("z") < 0 && str.indexOf("p") < 0) {
				System.out.println(str);
			} else {
				for (int i = 0; i < str.length() - 2; i++) {
					if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
						nStr += "zp";
						i += 2;
					} else {
						nStr += str.charAt(i);
					}

				}
			}
			System.out.println(nStr);
		}
	}
}
