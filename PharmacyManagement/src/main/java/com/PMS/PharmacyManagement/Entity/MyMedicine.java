package com.PMS.PharmacyManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myMedicine")
public class MyMedicine {
	
	@Id
	private int id;
	private String name;
	private String company;
	private String price;
	public MyMedicine(int id, String name, String company, String price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	public MyMedicine() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
