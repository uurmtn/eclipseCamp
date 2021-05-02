package homeWork2;

public class User {
	private int id;
	private String email;
	private String password;
	private String location;
	private String phoneNumber;

	public User() {
	}

	public User(int id, String email, String password, String location, String phoneNumber) {

		this.id = id;
		this.email = email;
		this.password = password;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}