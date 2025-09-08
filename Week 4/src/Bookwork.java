
public class Bookwork 
{

	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		newLine();
		System.out.println("Cruel");
		threeLines();
		System.out.println("World!");
		
		
		print("Hello World!");
		printN("Hello", 3);
		
		
		int hour = 9;
		int minute = 28;
		printTime(hour, minute);
		
		
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		newLine();
		System.out.println(root + " " + angle + " " + height);
		System.out.println(Math.toDegrees(Math.PI));
		System.out.println(Math.cos(angle + Math.PI / 2.0));
		
		
		String name = "Austin";
		String starName = starFiller(name);
		print(starName);
	}


	private static String starFiller(String name)
	{
		String ret = "";
		for( int i = 0; i < name.length(); i++)
			ret+="*" + name.charAt(i);
		
		ret += "*";
		return ret;
	}


	private static void printTime(int h, int m)
	{
		System.out.print(h);
		System.out.print(":");
		System.out.print(m);
	}


	private static void printN(String s, int num)
	{
		for(int i = 0; i < num; i ++)
			System.out.println(s);		
	}


	private static void print(String s)
	{
		System.out.println(s);
	}


	private static void threeLines()
	{
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	private static void newLine()
	{
		System.out.println();
	}
	
	
}
