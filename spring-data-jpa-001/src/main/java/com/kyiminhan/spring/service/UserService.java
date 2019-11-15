package com.kyiminhan.spring.service;

import java.util.List;
import java.util.Optional;

import com.kyiminhan.spring.entity.User;

public interface UserService {

	List<User> findAll();

	Optional<User> findById(Long userId);

	User save(User user);

	void delete(User user);

	User findByName(String firstName, String lastName);
}
