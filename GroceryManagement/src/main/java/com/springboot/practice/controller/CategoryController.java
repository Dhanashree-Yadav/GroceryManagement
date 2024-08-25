package com.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.request.CategoryRequest;
import com.springboot.practice.response.CategoryResponse;
import com.springboot.practice.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService cService;

	@PostMapping("/save")
	public ResponseEntity<CategoryResponse> saveCategory(@RequestBody CategoryRequest request) {
		CategoryResponse response = cService.saveCategory(request);
		if (response != null) {
			return new ResponseEntity<CategoryResponse>(response, HttpStatus.OK);
		} else {
			return new ResponseEntity<CategoryResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	public ResponseEntity<?> getcategoryDetails(){
		return null;
	}
	
}
