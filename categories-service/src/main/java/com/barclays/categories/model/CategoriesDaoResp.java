package com.barclays.categories.model;

import java.util.List;

import lombok.Data;

@Data
public class CategoriesDaoResp {
	
	private String respCode;
	private String respMsg;
	
	private List<CategoriesDao> categoriesDao;

}
