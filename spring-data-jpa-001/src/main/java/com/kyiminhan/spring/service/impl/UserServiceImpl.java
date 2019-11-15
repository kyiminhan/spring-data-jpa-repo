package com.kyiminhan.spring.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.kyiminhan.spring.entity.User;
import com.kyiminhan.spring.repository.UserRepository;
import com.kyiminhan.spring.service.UserService;

@Lazy
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> findById(Long userId) {
		return userRepo.findById(userId);
	}

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	@Override
	public void delete(User user) {
		userRepo.delete(user);
	}

	@Override
	public User findByName(String firstName, String lastName) {
		return userRepo.findByFirstNameAndLastName(firstName, lastName);
	}
}