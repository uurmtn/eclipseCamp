package homeWork2;

public class Main {

	public static void main(String[] args) {
		Instructor egitmen1 = new Instructor(1, "deneme@deneme", "********", "Ankara", "055511111111", 1, "Engin",
				"Demiro�", "Backend", "T�rk�e");

		Instructor egitmen2 = new Instructor(2, "asdfg@deneme", "********", "�stanbul", "343434343434", 2, "Metin",
				"Diyar", "Backend", "T�rk�e");

		Instructor egitmen3 = new Instructor(1, "qwer1@deneme", "********", "Mardin", "0474747474747", 2, "U�ur",
				"Metin", "Backend", "T�rk�e");

		Student �grenci1 = new Student(1, "�gr1@11", "+++++++++", "Mardin", "111111151", 1, "Araf", "Metin", "147",
				"Erkek");
		Student �grenci2 = new Student(2, "�gr1@11", "+++++++++", "Mardin", "222222222", 2, "Defne", "Hava", "123",
				"K�z");
		Student �grenci3 = new Student(3, "�gr1@11", "+++++++++", "Mardin", "365222222", 3, "Arif", "D�ndar", "159",
				"Erkek");

		InstructorManager egitmen = new InstructorManager();
		egitmen.add(egitmen1);
		egitmen.update(egitmen2);
		egitmen.login(egitmen3);
		egitmen.addLesson(egitmen1);
		egitmen.deleteLesson(egitmen2);

		System.out.println("----------------------------------------------------");

		StudentManager �grenci = new StudentManager();
		�grenci.add(�grenci1);
		�grenci.login(�grenci2);
		�grenci.homework(�grenci3);
		
		System.out.println("----------------------------------------------------");

		
		
		

	}

}
