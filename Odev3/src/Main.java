
public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"123456","Mertcan","Karaman","ayrtonsenna@gmail.com",35,"Istanbul");
		Instructor instructor = new Instructor(2,"123456","Engin","Demirog","engindemirog@gmail.com","javaReact2");
		
		StudentManager studenManager = new StudentManager();
		studenManager.addUser(student);
		studenManager.deleteUser(student);
		studenManager.login(student);
		studenManager.logOut(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.deleteUser(instructor);
		instructorManager.login(instructor);
		instructorManager.logOut(instructor);

	}

}
