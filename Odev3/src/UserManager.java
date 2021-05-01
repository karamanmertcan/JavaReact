
public class UserManager {
	public void addUser(User user) {
		System.out.println("Yeni kullanici eklendi : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void deleteUser(User user) {
		System.out.println("Kullanici silindi : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	
	public void login(User user) {
		if(user.getEmail() == "ayrtonsenna@gmail.com" && user.getPassword() == "123456") {
			System.out.println("Kullanici basariyla giris yapti : " + user.getFirstName() + " " + user.getLastName() );
		}else {
			System.out.println("Kullanici bilgileri yanlis.");
		}
	}
	
	public void logOut(User user) {
		System.out.println("Kullanici basariyla cikis yapti : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName() );
	}
}
	
	
	
