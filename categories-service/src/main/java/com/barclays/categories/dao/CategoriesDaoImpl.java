package com.barclays.categories.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.barclays.categories.model.CategoriesDaoRequest;
import com.barclays.categories.model.CategoriesDaoResp;
import com.barclays.categories.model.StatusBlock;
import com.barclays.categories.model.Categories;

@Component
public class CategoriesDaoImpl implements ICategoriesDao {

	public CategoriesDaoResp getAllCategories(CategoriesDaoRequest daoRequest) {
		//1. TODO : Prepare the request for database
		//2. call database and get the Resultset response
		//3. prepare the dao response with the help of database(Resultset) response.
		
		CategoriesDaoResp  categoriesDaoResp = new  CategoriesDaoResp();
		StatusBlock statusblock = new StatusBlock();
		statusblock.setRespCode(categoriesDaoResp.getRespCode());
		statusblock.setRespMsg(categoriesDaoResp.getRespMsg());
		
		List<Categories> categoriesList = new ArrayList<>();
		
		
		return null;
	}
}
