package com.jssm.hulkstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	private long id;
	private String productType;
	private String category;
	private String name;
	private String description; // @edit -> Change to big Decimal
	private String date;
	private int amount;
	private String cost;
	
	
	
	public Product() {
		
	}

	
	public Product(long id, String productType, String category, String name, String description, String date,
			int amount, String cost) {
		this.id = id;
		this.productType = productType;
		this.category = category;
		this.name = name;
		this.description = description;
		this.date = date;
		this.amount = amount;
		this.cost = cost;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	@Column(name = "product_type", nullable = false)
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
	@Column(name = "category", nullable = false)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name = "date", nullable = false)
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Column(name = "cost", nullable = false)
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}

