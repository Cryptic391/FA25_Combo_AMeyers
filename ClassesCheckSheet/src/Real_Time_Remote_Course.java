
public class Real_Time_Remote_Course extends Online_Course{
	private String zoomInfo;
	
	
	public Real_Time_Remote_Course() {
		super();
		this.zoomInfo = "";
	}


	public Real_Time_Remote_Course(String courseNum, int numStudents, int maxStudents, int credits, String zoomInfo) {
		super(courseNum, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;
	}


	public String getZoomInfo() {
		return zoomInfo;
	}


	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}


	@Override
	public String toString() {
		return "Real Time Remote Course \nZoom Info: " + zoomInfo + "\nCourse Number: " + super.getCourseNum() + "\nNumber of Students: " + super.getNumStudents() + "\nMax Number of Students: " + super.getMaxStudents()
		+ "\nCredits: " + super.getCredits();
	}

	
	
}
