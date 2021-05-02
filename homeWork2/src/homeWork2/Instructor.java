package homeWork2;

public class Instructor extends User {

	private int userId;
	private String firstName;
	private String lastName;
	private String branch;
	private String language;

	

	public Instructor(int id, String email, String password, String location, String phoneNumber, int userId,
			String firstName, String lastName, String branch, String language) {

		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.language = language;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}