package com.kyiminhan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

}
