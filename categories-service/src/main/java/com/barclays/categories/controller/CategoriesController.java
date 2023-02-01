package com.barclays.categories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.categories.model.CategoriesRequest;
import com.barclays.categories.model.CategoriesResponse;
import com.barclays.categories.service.ICategoriesService;
import com.barclays.categories.validator.CategoriesRequestValidator;


@RestController
public class CategoriesController {
	
	@Autowired
	CategoriesRequestValidator categoriesRequestValidator;
	
	@Autowired
	ICategoriesService categoriesService;
	
	@ResponseBody
	@GetMapping("/categories/{cardnum}")
	public CategoriesResponse getAllCategories(@PathVariable("cardnum") String cardnum,
											   @RequestHeader("client_id")String clientId,
											   @RequestHeader("channelid")String channelId,
											   @RequestHeader("request_id")String requestId,
											   @RequestHeader("messageTs")String messageTs,
											   @RequestHeader("auth_token")String authToken) {
		
		CategoriesResponse categoriesResponse = new CategoriesResponse();
		
		// 1. Validate the request, if request is invalid send error response using custom exception or user defined exception
		
		//categoriesRequestValidator.validateCategoriesRequest(categoriesRequest);
		
		// 2. prepare the request for service class
		
		// 3. call service class and get response
		
		//CategoriesResponse categoriesResponse = categoriesService.getAllCategories(categoriesRequest);
		
	return categoriesResponse;
	
	}
}
