package homeWork2;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("E�itmen ekleme �al��t�: ");
	}

	@Override
	public void update(User user) {
		System.out.println("E�itmen g�ncelleme �al��t�: ");
	}

	@Override
	public void login(User user) {
		System.out.println("Giri� ba�ar�l� ");
	}

	public void addLesson(Instructor instructor) {
		System.out.println("Yeni ders eklendi");

	}
	
	public void deleteLesson(Instructor instructor) {
		System.out.println("Ders silindi");

	}

}
