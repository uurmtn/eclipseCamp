package homeWork2;

public class Main {

	public static void main(String[] args) {
		Instructor egitmen1 = new Instructor(1, "deneme@deneme", "********", "Ankara", "055511111111", 1, "Engin",
				"Demiroð", "Backend", "Türkçe");

		Instructor egitmen2 = new Instructor(2, "asdfg@deneme", "********", "Ýstanbul", "343434343434", 2, "Metin",
				"Diyar", "Backend", "Türkçe");

		Instructor egitmen3 = new Instructor(1, "qwer1@deneme", "********", "Mardin", "0474747474747", 2, "Uður",
				"Metin", "Backend", "Türkçe");

		Student ögrenci1 = new Student(1, "ögr1@11", "+++++++++", "Mardin", "111111151", 1, "Araf", "Metin", "147",
				"Erkek");
		Student ögrenci2 = new Student(2, "ögr1@11", "+++++++++", "Mardin", "222222222", 2, "Defne", "Hava", "123",
				"Kýz");
		Student ögrenci3 = new Student(3, "ögr1@11", "+++++++++", "Mardin", "365222222", 3, "Arif", "Dündar", "159",
				"Erkek");

		InstructorManager egitmen = new InstructorManager();
		egitmen.add(egitmen1);
		egitmen.update(egitmen2);
		egitmen.login(egitmen3);
		egitmen.addLesson(egitmen1);
		egitmen.deleteLesson(egitmen2);

		System.out.println("----------------------------------------------------");

		StudentManager ögrenci = new StudentManager();
		ögrenci.add(ögrenci1);
		ögrenci.login(ögrenci2);
		ögrenci.homework(ögrenci3);
		
		System.out.println("----------------------------------------------------");

		
		
		

	}

}
