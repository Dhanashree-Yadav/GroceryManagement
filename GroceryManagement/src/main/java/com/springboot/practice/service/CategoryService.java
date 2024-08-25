package com.springboot.practice.service;

import org.springframework.stereotype.Service;

import com.springboot.practice.request.CategoryRequest;
import com.springboot.practice.response.CategoryResponse;

@Service
public interface CategoryService {
	CategoryResponse saveCategory(CategoryRequest request);
}
