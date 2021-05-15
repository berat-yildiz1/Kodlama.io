package Entities.Concretes;


import Entities.Abstract.IPlayers;

public class Players implements IPlayers {
	
	private int id;
	private String Nationalityid;
	private String FirstName;
	private String LastName;
	private int yas;
	
	public Players() {

	}
	
	public Players(int id, String nationalityid, String firstName, String lastName, int yas) {
		super();
		this.id = id;
		Nationalityid = nationalityid;
		FirstName = firstName;
		LastName = lastName;
		this.yas=yas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityid() {
		return Nationalityid;
	}

	public void setNationalityid(String nationalityid) {
		Nationalityid = nationalityid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}


	
	
	
	
	
	
	
	

}
