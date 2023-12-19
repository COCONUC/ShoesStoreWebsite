package com.shoestore.dto;

import java.sql.Blob;
import java.util.Date;

public class AdminCreateProductDto {
	private int id;
	private int brand_id;
	private String product_name;
	private String version;
	private double price;
	private Date create_at;
	private Blob image_link;
	private boolean status;

	public AdminCreateProductDto() {
		// TODO Auto-generated constructor stub
	}

	public AdminCreateProductDto(int id, int brand_id, String product_name, String version, double price,
			Date create_at, Blob image_link, boolean status) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.product_name = product_name;
		this.version = version;
		this.price = price;
		this.create_at = create_at;
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

}
