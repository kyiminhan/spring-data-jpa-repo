package com.kyiminhan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
