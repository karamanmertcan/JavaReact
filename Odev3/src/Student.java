
public class Student extends User {
	private int courseComplete;
	private String studentLocation;
	
	public Student(int id, String password, String firstName, String lastName, String email, int courseComplete,
			String studentLocation) {
		super(id, password, firstName, lastName, email);
		this.courseComplete = courseComplete;
		this.studentLocation = studentLocation;
	}

	public int getCourseComplete() {
		return courseComplete;
	}

	public void setCourseComplete(int courseComplete) {
		this.courseComplete = courseComplete;
	}

	public String getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}
	
	
	
}
