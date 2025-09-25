package Week5Loops;

public class Sum_Of_While_Numbers {

	public static void main(String[] args) {
		int sum = SumWhile();
		System.out.println(sum);
		System.out.println();
	}

	private static int SumWhile() {
		int sum = 0;
		int i = 0;
		while(i < 10)
		{
			sum+=i;
			i++;
		}
		return sum;		
	}
}