package com.PMS.PharmacyManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pharmacy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String name;
	private String company;
	private String price;
	
	public Pharmacy(int id, String name, String company, String price) {
		super();
		this.id=id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public Pharmacy() {
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
