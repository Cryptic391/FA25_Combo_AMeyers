
public class In_Person_Course extends Course {
	private String roomNum;
	
	
	public In_Person_Course() {
		super();
		this.roomNum = "";
	}


	public In_Person_Course(String courseNum, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseNum, numStudents, maxStudents, credits);
		this.roomNum = roomNum;
	}


	public String getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}


	@Override
	public String toString() {
		return "In Person Course \nRoom Number: " + roomNum + "\nCourse Number: " + super.getCourseNum() + "\nNumber of Students: " + super.getNumStudents() + "\nMax Number of Students: " + super.getMaxStudents()
				+ "\nCredits: " + super.getCredits();
	}

	
}
