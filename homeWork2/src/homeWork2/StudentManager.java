package homeWork2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Kaydýnýz baþarýlý: ");
	}
		
	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý ");
	}
	
	public void homework(Student student) {
		System.out.println("Ödev teslim edildi");
	}

	

		

}
