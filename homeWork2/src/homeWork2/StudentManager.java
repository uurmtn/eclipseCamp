package homeWork2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Kayd�n�z ba�ar�l�: ");
	}
		
	@Override
	public void login(User user) {
		System.out.println("Giri� ba�ar�l� ");
	}
	
	public void homework(Student student) {
		System.out.println("�dev teslim edildi");
	}

	

		

}
