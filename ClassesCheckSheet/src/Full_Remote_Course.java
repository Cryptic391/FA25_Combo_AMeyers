
public class Full_Remote_Course extends Online_Course {
	private String emailInfo;
	
	public Full_Remote_Course() {
		super();
		this.emailInfo = "";
	}

	public Full_Remote_Course(String courseNum, int numStudents, int maxStudents, int credits, String emailInfo) {
		super(courseNum, numStudents, maxStudents, credits);
		this.emailInfo = emailInfo;
	}

	public String getEmailInfo() {
		return emailInfo;
	}

	public void setEmailInfo(String emailInfo) {
		this.emailInfo = emailInfo;
	}

	@Override
	public String toString() {
		return "Full Remote Course \nEmail Info:" + emailInfo + "\nCourse Number: " + super.getCourseNum() + "\nNumber of Students: " + super.getNumStudents() + "\nMax Number of Students: " + super.getMaxStudents()
		+ "\nCredits: " + super.getCredits();
	}

	
	
}
