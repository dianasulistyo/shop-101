package com.diana.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diana.entity.Product;
import com.diana.service.ProductService;

/**
 * 
 * @author dianasulistyo
 *
 */

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserForm(Model model) {
		List<Product> products = service.findAllProduct();
        model.addAttribute("product",products);
        return "index";
    }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct( Model model, Product product) {
        service.addProduct(product);
        model.addAttribute("saved", "success");
        return "index";
    }

	
}
