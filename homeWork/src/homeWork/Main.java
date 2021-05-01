package homeWork;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor(1,"Engin","Demiroð","C#, Java");
		Instructor instructor2=new Instructor(2,"Þadi Evren","Þeker","Data Science");
		Instructor instructor3=new Instructor(3,"Murat","Yücedað","C#, MVC5");
		Instructor instructor4=new Instructor(4,"Mehmet Ali","Bayram","Flutter");
		Instructor instructor5=new Instructor(5,"Kayhan","Ayar","C++");
		Instructor instructor6=new Instructor(6,"Uður","Metin","Python");
		
		System.out.println("------------------------------Eðitmenler------------------------------");
		Instructor[] instructors= {instructor1,instructor2,instructor3,instructor4,instructor5,instructor6};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name+" "+instructor.lastName+" "+instructor.expertness);
		}
		
		Course course1=new Course(1, "C#", instructor1.name+" "+instructor1.lastName, "", "Kayýtlý öðrenci: 2562");
		Course course2=new Course(2, "C++", instructor5.name+" "+instructor5.lastName, "", "Kayýtlý öðrenci: 1547");
		Course course3=new Course(3, "Data Science", instructor2.name+" "+instructor2.lastName, "", "Kayýtlý öðrenci: 1685");
		Course course4=new Course(4, "Java", instructor1.name+" "+instructor1.lastName, "", "Kayýtlý öðrenci: 2762");
		
		System.out.println("------------------------------Kurslar------------------------------");
		
		Course[] courses= {course1,course2,course3,course4};
		for (Course course : courses) {
			System.out.println(course.name+": "+course1.instructor+"."+course.studentQuantity);
		}
		
		System.out.println("------------------------------Metotlar------------------------------");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.salary(instructor6);

	}

}
