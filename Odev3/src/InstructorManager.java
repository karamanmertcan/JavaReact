
public class InstructorManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println("Sisteme eklenen ogretmenin bilgileri : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println("Sistemden silinen ogretmenin bilgileri : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override

	public void login(User user) {
		if(user.getEmail() == "engindemirog@gmail.com" && user.getPassword() == "123456") {
			System.out.println("Egitmen basariyla giris yapti : " + user.getFirstName() + " " + user.getLastName() );
		}else {
			System.out.println("Egitmen bilgileri yanlis");
		}
	}
	
	@Override
	public void logOut(User user) {
		System.out.println("Egitmen basariyla cikis yapti : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName() );
	}
}
