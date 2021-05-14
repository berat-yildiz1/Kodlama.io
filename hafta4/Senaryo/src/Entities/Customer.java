package Entities;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String firstname;
	private String lastname;
	private String dateofbirth;
	private String nationalityid;
	
	public Customer(){};
	
	public Customer(int id, String firstname, String lastname, String dateofbirth, String nationalityid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.nationalityid = nationalityid;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getNationalityid() {
		return nationalityid;
	}

	public void setNationalityid(String nationalityid) {
		this.nationalityid = nationalityid;
	}

}
