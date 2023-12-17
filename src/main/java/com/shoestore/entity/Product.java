package com.shoestore.entity;

import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "brand_id")
	private int brand_id;
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	private String product_name;
	private String version;
	private double price;
	private Date create_at;
	private Date update_at;
	private Blob image_link;
	private boolean status;
	//con thieu field cua brand dung de map chua co constructor tong va da co getter setter
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, int brand_id, String product_name, String version, double price, Date create_at,
			Date update_at, Blob image_link, boolean status) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.product_name = product_name;
		this.version = version;
		this.price = price;
		this.create_at = create_at;
		this.update_at = update_at;
		this.image_link = image_link;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public Blob getImage_link() {
		return image_link;
	}

	public void setImage_link(Blob image_link) {
		this.image_link = image_link;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	
	
	
	
	
}
