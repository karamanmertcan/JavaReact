
public class Instructor extends User {
	private String courseNumber;
	
	
	public Instructor(int id, String password, String firstName, String lastName, String email, String courseNumber) {
		super(id, password, firstName, lastName, email);
		this.courseNumber = courseNumber;
	}


	public String getCourseNumber() {
		return courseNumber;
	}


	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	
	
	
}
