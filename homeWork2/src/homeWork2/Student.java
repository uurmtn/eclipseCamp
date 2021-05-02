package homeWork2;

public class Student extends User {

	private int userId;
	private String firstName;
	private String lastName;
	private String schoolNumber;
	private String gender;

	public Student() {
	}

	public Student(int id, String email, String password, String location, String phoneNumber, int userId,
			String firstName, String lastName, String schoolNumber, String gender) {

		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolNumber = schoolNumber;
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
