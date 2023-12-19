package com.shoestore.controller;

import java.util.Date;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoestore.dto.AdminCreateProductDto;
import com.shoestore.dto.ProductDto;
import com.shoestore.entity.Product;
import com.shoestore.entity.User;
import com.shoestore.repository.ProductRepository;
import com.shoestore.repository.UserRepository;
import com.shoestore.service.IProductService;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AdminController {
	@Autowired
	public UserRepository userRepository;

	@Autowired
	public IProductService productService;

	@Autowired
	public ProductRepository productRepository;

	public AdminController(UserRepository userRepository, ProductRepository productRepository,
			IProductService productService) {
		this.userRepository = userRepository;
		this.productRepository = productRepository;
		this.productService = productService;
	}

	@GetMapping("/")
	public User adminGetUserById() {
		return userRepository.findUserById(2);
	}

	@GetMapping("/all")
	public List<User> adminGetAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("/admin/GetAllProduct")
	public List<ProductDto> adminGetAllProduct() {
		return productService.adminGetAllProduct();
	}
	
	@GetMapping("/admin/add")
	public String comeAddImage() {
		return "addimage";
	}

	@PostMapping("/admin/createProduct")
	public AdminCreateProductDto createProduct(AdminCreateProductDto dto,HttpServletRequest request, @RequestParam("image_add") MultipartFile file)
			throws IOException, SerialException, SQLException {
		byte[] bytes = file.getBytes();
		Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		Product product = new Product();
		product.setProduct_name(dto.getProduct_name());
		product.setBrand_id(dto.getBrand_id());
		product.setVersion(dto.getVersion());
		product.setPrice(dto.getPrice());
		product.setImage_link(dto.getImage_link());
		product.setImage_link(blob);
		product.setCreate_at(new Date());
		product.setStatus(true);
		productRepository.save(product);

		return dto;
	}

}
