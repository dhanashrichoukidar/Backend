package com.institute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                 //used to mark class as entity class
public class StudentInfo {
	@Id                //used to mark variable as a primary key in the table
	private int id;
	private String name;
	private String contact;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}