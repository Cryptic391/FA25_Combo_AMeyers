import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(5);
		    list.add(8);
		    list.add(9);
		    list.add(1);
		    System.out.println(list);

		    list.remove(Integer.valueOf(1)); // Remove by object
		    list.remove(1); // Remove by index

		    System.out.println(list);

	}

}
