package com.test.mm.service.impl;

import org.springframework.stereotype.Service;

import com.test.mm.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public String getName() {
		return "Hello Spring boot!" + this.getClass();
	}

}
