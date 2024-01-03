package com.shoestore.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoestore.dto.AdminCreateProductDto;
import com.shoestore.dto.ProductDto;
import com.shoestore.entity.Product;
import com.shoestore.repository.ProductRepository;
import com.shoestore.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<ProductDto> adminGetAllProduct() {
		List<Product> list = productRepository.findAll();
		List<ProductDto> dto = new ArrayList<ProductDto>();
		for (Product p : list) {
			dto.add(new ProductDto(p.getId(), p.getBrand_id(), p.getBrand().getBrand_name(), p.getProduct_name(),
					p.getVersion(), p.getPrice(), p.getUpdate_at(), p.getCreate_at(), p.getImage_link(), p.isStatus()));
		}
		return dto;
	}

	// admin them moi 1 san pham
	@Override
	public Product adminCreateProduct(AdminCreateProductDto dto) {
		Product product = new Product();
		product.setProduct_name(dto.getProduct_name());
		product.setBrand_id(dto.getBrand_id());
		product.setVersion(dto.getVersion());
		product.setPrice(dto.getPrice());
		product.setImage_link(dto.getImage_link());
		product.setCreate_at(new Date());
		product.setStatus(true);
		productRepository.save(product);
		return product;
	}

}
