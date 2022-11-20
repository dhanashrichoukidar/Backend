package com.institute.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private double price;
	private int quantity;
	private boolean status;
	@CreationTimestamp // use to insert the creation date time as a System DateTime while inserting Data into DB
	private LocalDateTime createdt;
	@UpdateTimestamp // use this to get the updated time stamp while inserting and updating the record.
	private LocalDate updatedDate;
	
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDateTime getCreatedt() {
		return createdt;
	}
	public void setCreatedt(LocalDateTime createdt) {
		this.createdt = createdt;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	} 
}