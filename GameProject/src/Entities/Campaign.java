package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {

	public double campapignPrice;

	public Campaign(double campapignPrice) {
		super();
		this.campapignPrice = campapignPrice;
	}
	
	public double getCampapignPrice() {
		return campapignPrice;
	}

	public void setCampapignPrice(double campapignPrice) {
		this.campapignPrice = campapignPrice;
	}
	
}
