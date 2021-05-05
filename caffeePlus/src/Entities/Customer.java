package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	private int Id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private Long nationalityId;

	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, int dateOfBirth, Long nationalityId) {

		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long i) {
		this.nationalityId = i;
	}

}
