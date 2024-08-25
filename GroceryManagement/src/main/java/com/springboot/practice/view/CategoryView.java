package com.springboot.practice.view;

public class CategoryView {
	private String code;
	private String name;
	private String description;
	public CategoryView(String code, String name, String description) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
