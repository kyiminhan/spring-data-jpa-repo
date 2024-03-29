package com.kyiminhan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.entity.Department;

@Repository
public interface DeptRepo extends JpaRepository<Department, Long> {

}
