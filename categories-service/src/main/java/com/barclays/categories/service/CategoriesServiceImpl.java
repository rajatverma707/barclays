package com.barclays.categories.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.categories.dao.ICategoriesDao;
import com.barclays.categories.model.CategoriesDaoRequest;
import com.barclays.categories.model.CategoriesDaoResp;
import com.barclays.categories.model.CategoriesRequest;
import com.barclays.categories.model.CategoriesResponse;

@Service
public class CategoriesServiceImpl implements ICategoriesService{

	@Autowired
	ICategoriesDao categoriesDao;
	
	@Override
	public CategoriesResponse getAllCategories(CategoriesRequest categoriesRequest) {
		// 1. get the request from controller 
		// 2. prepare the request for dao
		
		CategoriesDaoRequest  daoRequest = new CategoriesDaoRequest();
		
		// 3. Call dao and get response
		
		CategoriesDaoResp categoriesDaoResp = categoriesDao.getAllCategories(daoRequest);
		
		
		// prepare CategoriesDaoResp and return CategoriesDaoResp
		 return null;
	}

}
