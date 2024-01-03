package com.shoestore.dto;

import java.sql.Blob;
import java.util.Date;

public class ProductDto {

	private int id;
	private int brand_id;
	private String brand_name;
	private String product_name;
	private String version;
	private double price;
	private Date create_at;
	private Date update_at;
	private Blob image_link;
	private boolean status;

	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(int id, int brand_id, String brand_name, String product_name, String version, double price,
			Date create_at, Date update_at, Blob image_link, boolean status) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.brand_name = brand_name;
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

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
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

}
