package com.shoestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoestore.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//	@Query("Select p.product_name from Product p")
//	public List<Product> getAllProduct();
}
