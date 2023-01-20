package com.barclays.categories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.categories.model.CategoriesRequest;
import com.barclays.categories.model.CategoriesResponse;
import com.barclays.categories.service.ICategoriesService;


@RestController
public class CategoriesController {
	
	@Autowired
	ICategoriesService categoriesService;
	
	
	public CategoriesResponse getAllCategories(CategoriesRequest categoriesRequest) {
		
	return null;
	
	}
}
