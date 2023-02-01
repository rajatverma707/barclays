package com.barclays.categories.model;

import lombok.Data;

@Data
public class CategoriesDao {

	private String id;
	private String name;
	private String type;
	private String desc;
	private String status;
}
