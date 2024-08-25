package com.springboot.practice.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.model.CategoryModel;
import com.springboot.practice.repository.CategoryRepository;
import com.springboot.practice.request.CategoryRequest;
import com.springboot.practice.response.CategoryResponse;
import com.springboot.practice.response.ErrorResponse;
import com.springboot.practice.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository cRepository;

	private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

	public CategoryResponse saveCategory(CategoryRequest request) {
		CategoryResponse response = new CategoryResponse();

		if (request != null) {
			try {

				CategoryModel model = new CategoryModel();
				model.setCcode(request.getCcode());
				model.setCname(request.getCname());
				model.setCdesc(request.getCdesc());
				cRepository.save(model);

				logger.info("Category resource created successfully!");

				response.setMessage("Category is created.");

				ErrorResponse errorResponse = new ErrorResponse();
				errorResponse.setDetail("Category code : " + request.getCcode());
				errorResponse.setStatuscode("OK");
				response.setResponse(errorResponse);
				response.setStatus("Created");
			}

			catch (Exception e) {

				logger.error("Failed to create category resource due to :{}", e.getMessage(), e);
				ErrorResponse errorResponse = new ErrorResponse();
				errorResponse.setDetail("An error occurred while creating the category: " + e.getMessage());
				errorResponse.setStatuscode("INTERNAL_SERVER_ERROR");
				response.setResponse(errorResponse);
				response.setStatus("Failed");
			}

		} else {

			logger.warn("Category creation request is null.");
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setDetail("Request cannot be null.");
			errorResponse.setStatuscode("NULL_REQUEST_ERROR");
			response.setResponse(errorResponse);
			response.setStatus("Failed");

		}

		return response;

	}
}
