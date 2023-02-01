package com.barclays.product.dao;

import com.barclays.product.model.ProductDaoRequest;
import com.barclays.product.model.ProductDaoResp;

public interface IProductDao {
	
	ProductDaoResp getAllCategories(ProductDaoRequest daoRequest);

}
