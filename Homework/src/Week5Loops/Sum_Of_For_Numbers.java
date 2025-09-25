package Week5Loops;

public class Sum_Of_For_Numbers {

	public static void main(String[] args) {
		int sum = SumFor();
		System.out.println(sum);
		System.out.println();
	}
	
	private static int SumFor() 
	{
		int sum = 0;
		for( int i =0; i < 10; i++)
		{
			sum+=i;
		}
		return sum;
	}
}