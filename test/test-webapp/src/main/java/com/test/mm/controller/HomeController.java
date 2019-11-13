package com.test.mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.mm.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;

	@GetMapping("/")
	public String home() {
		return homeService.getName();
	}
}
