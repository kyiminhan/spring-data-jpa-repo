package com.kyiminhan.spring.serivce;

import java.util.Collection;

import com.kyiminhan.spring.entity.Department;

public interface DeptService {

	Collection<Department> findAll();
	
	void initLoading();
}
