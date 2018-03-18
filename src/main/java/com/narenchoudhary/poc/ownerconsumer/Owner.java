package com.narenchoudhary.poc.ownerconsumer;

public class Owner {
	
	private int ownerId;
	private String ownerName;
	
	
	public Owner() {
		super();
	}
	
	public Owner(int ownerId, String ownerName) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
	}

	public int getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}
