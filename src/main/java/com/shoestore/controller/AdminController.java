package com.shoestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminController {
    
	@GetMapping("/amdin-login")
    public String adminLogin(){
        return "admin/login";
    }

	@GetMapping("/amdin-dashboard")
    public String adminDashboard(){
        return "admin/dashboard";
    }
    
	@GetMapping("/amdin-products")
    public String adminProducts(){
        return "admin/products";
    }
    

	@GetMapping("/amdin-orders")
    public String adminOrders(){
        return "admin/orders";
    }

	@GetMapping("/amdin-order-detail")
    public String adminOrdersDetails(){
        return "admin/order-detail";
    }
}