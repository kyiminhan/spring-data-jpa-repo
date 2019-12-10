package com.kyiminhan.spring.serivce.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kyiminhan.spring.entity.Department;
import com.kyiminhan.spring.entity.Employee;
import com.kyiminhan.spring.repository.DeptRepo;
import com.kyiminhan.spring.serivce.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepo repo;

	@Transactional
	@Override
	public Collection<Department> findAll() {

		return this.repo.findAll();
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void initLoading() {
		if (this.repo.count() < 1) {
			for (int i = 1; i < 6; i++) {
				Department department = Department.builder().deptName("Department" + i).build();

				Set<Employee> employees = new HashSet<>();
				for (int j = 1; j < 6; j++) {
					Employee emp = Employee.builder().empName("Employee" + i + "" + j).dept(department).build();
					employees.add(emp);
				}
				department.setEmps(employees);
				this.repo.saveAndFlush(department);
			}
		}
	}
}