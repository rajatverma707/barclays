package com.barclays.categories.dao;

import com.barclays.categories.model.CategoriesDaoRequest;
import com.barclays.categories.model.CategoriesDaoResp;

public interface ICategoriesDao {
	
	CategoriesDaoResp getAllCategories(CategoriesDaoRequest daoRequest);

}
