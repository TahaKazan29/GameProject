package Entities;


import java.util.Date;

import Abstract.IEntity;

public class Play implements IEntity {

	private int id;
	private String playName;
	private Date releaseDate;
	private double price;
	
	public Play(int id, String playName, Date releaseDate, double price) {
		super();
		this.id = id;
		this.playName = playName;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
