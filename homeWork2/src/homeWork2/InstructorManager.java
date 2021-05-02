package homeWork2;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Eðitmen ekleme çalýþtý: ");
	}

	@Override
	public void update(User user) {
		System.out.println("Eðitmen güncelleme çalýþtý: ");
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý ");
	}

	public void addLesson(Instructor instructor) {
		System.out.println("Yeni ders eklendi");

	}
	
	public void deleteLesson(Instructor instructor) {
		System.out.println("Ders silindi");

	}

}
