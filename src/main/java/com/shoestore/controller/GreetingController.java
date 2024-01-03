package com.shoestore.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.shoestore.dto.AdminCreateProductDto;
import com.shoestore.entity.Product;
import com.shoestore.repository.ProductRepository;
import com.shoestore.repository.UserRepository;
import com.shoestore.service.IProductService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {

	@Autowired
	public ProductRepository productRepository;

	public GreetingController(ProductRepository productRepository) {

		this.productRepository = productRepository;

	}

	@GetMapping("/greeting")
	public String greeting() {
		return "addimage";
	}

	@PostMapping("/add")
	public Product createProduct(@RequestParam("product_name") String name, @RequestParam("brand") String brandName,
			@RequestParam("version") String versionDescription, @RequestParam("price") String gia,

			@RequestParam("image") MultipartFile file) throws IOException, SerialException, SQLException {
		byte[] bytes = file.getBytes();
		Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		Product product = new Product();
//		product.setProduct_name(dto.getProduct_name());
//		product.setBrand_id(dto.getBrand_id());
//		product.setVersion(dto.getVersion());
//		product.setPrice(dto.getPrice());
//		product.setImage_link(dto.getImage_link());
//		product.setImage_link(blob);
//		product.setCreate_at(new Date());
//		product.setStatus(true);
		product.setProduct_name(name);
		product.setBrand_id(Integer.parseInt(brandName));
		product.setPrice(Double.parseDouble(gia));
		product.setVersion(versionDescription);
		product.setCreate_at(new Date());
		product.setImage_link(blob);
		product.setStatus(true);
		productRepository.save(product);

		return product;
	}
}