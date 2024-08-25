package com.springboot.practice.response;

import java.util.List;

import com.springboot.practice.view.CategoryView;

public class CategoryListResponse {
	private List<CategoryView> categories;

	public CategoryListResponse(List<CategoryView> categories) {
		super();
		this.categories = categories;
	}

	public List<CategoryView> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryView> categories) {
		this.categories = categories;
	}

}
