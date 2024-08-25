package com.springboot.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.practice.request.CategoryRequest;
import com.springboot.practice.response.CategoryListResponse;
import com.springboot.practice.response.CategoryResponse;

@Service
public interface CategoryService {
	CategoryResponse saveCategory(CategoryRequest request);

	CategoryListResponse getcategoryDetails();
}
