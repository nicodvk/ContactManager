package com.ndevynck.eiwd306.classes;

import java.util.ArrayList;

public class Person {
//	Fields
	private int id;
	private boolean male;
	private String lastname, firstname, phoneNumber, description;
	private Address address;
	private final ArrayList<String> abilities = new ArrayList<String>();
	
//	Getters / Setters
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public ArrayList<String> getAbilities() {
		return abilities;
	}
}
