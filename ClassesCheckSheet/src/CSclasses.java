import java.util.Scanner;

public class CSclasses {

	public Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Course[] courseList = new Course[3];
		
		courseList[0] = new In_Person_Course("CSC119", 10, 20, 3, "NC16");
		courseList[1] = new Full_Remote_Course("CSC120", 15, 30, 4, "email@email.com");
		courseList[2]= new Real_Time_Remote_Course("CSC121", 17, 35, 2, "zoom");
		
		
		System.out.println(courseList[0]);
		System.out.println();
		System.out.println(courseList[1]);
		System.out.println();
		System.out.println(courseList[2]);
	}

}
