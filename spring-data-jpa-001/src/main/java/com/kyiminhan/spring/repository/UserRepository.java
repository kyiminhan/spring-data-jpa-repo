package com.kyiminhan.spring.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.entity.User;

@Lazy
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByFirstNameAndLastName(String firstName, String lastName);

}