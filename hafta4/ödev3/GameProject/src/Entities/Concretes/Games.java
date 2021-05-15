package Entities.Concretes;

import Entities.Abstract.IGames;

public class Games implements IGames{
	
	private int id;
	private String Gamename;
	private String type;
	private double price;
	private int amount;
	
	public Games() {
		
	}
	
	public Games(int id, String gamename, String type, double price,int amount) {
		super();
		this.id = id;
		Gamename = gamename;
		this.type = type;
		this.price = price;
		this.amount=amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGamename() {
		return Gamename;
	}

	public void setGamename(String gamename) {
		Gamename = gamename;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
