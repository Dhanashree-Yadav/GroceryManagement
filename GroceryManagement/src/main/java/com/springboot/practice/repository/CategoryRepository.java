package com.springboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Integer>{

}
