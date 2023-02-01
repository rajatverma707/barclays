package com.barclays.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.product.model.ProductRequest;
import com.barclays.product.model.ProductResponse;
import com.barclays.product.service.IProductService;


@RestController
public class ProductController {
	
	@Autowired
	IProductService categoriesService;
	
	
	public ProductResponse getAllCategories(ProductRequest categoriesRequest) {
		
	return null;
	
	}
}
