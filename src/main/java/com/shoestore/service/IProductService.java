package com.shoestore.service;

import java.util.List;

import com.shoestore.dto.AdminCreateProductDto;
import com.shoestore.dto.ProductDto;
import com.shoestore.entity.Product;

public interface IProductService {
	public List<ProductDto> adminGetAllProduct();

	public Product adminCreateProduct(AdminCreateProductDto dto);
}
