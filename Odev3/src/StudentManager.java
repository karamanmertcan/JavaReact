
public class StudentManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println("Sisteme eklenen ogrencinin bilgileri : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println("Sistemden silinen ogrencinin bilgileri : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override

	public void login(User user) {
		if(user.getEmail() == "ayrtonsenna@gmail.com" && user.getPassword() == "123456") {
			System.out.println("Ogrenci basariyla giris yapti : " + user.getFirstName() + " " + user.getLastName() );
		}else {
			System.out.println("Ogrenci bilgileri yanlis");
		}
	}
	
	@Override
	public void logOut(User user) {
		System.out.println("Ogrenci basariyla cikis yapti : " + user.getEmail() + " " + user.getFirstName() + " " + user.getLastName() );
	}
}
