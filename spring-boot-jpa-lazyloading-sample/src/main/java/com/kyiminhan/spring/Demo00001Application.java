package com.kyiminhan.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kyiminhan.spring.entity.Department;
import com.kyiminhan.spring.serivce.DeptService;

import lombok.extern.slf4j.Slf4j;

@EnableJpaAuditing
@EnableJpaRepositories
@SpringBootApplication
@ComponentScan(basePackages = "com.kyiminhan")
@EntityScan(basePackages = { "com.kyiminhan.spring.entity" })
@Slf4j
public class Demo00001Application implements CommandLineRunner {

	@Autowired
	private DeptService deptService;

	public static void main(String[] args) {
		SpringApplication.run(Demo00001Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.deptService.initLoading();

		Collection<Department> departments = this.deptService.findAll();

		departments.forEach(dept -> {
			log.info(dept.getId() + "\t" + dept.getDeptName());
			dept.getEmps().forEach(emp -> {
				log.info(emp.getId() + "\t" + emp.getEmpName());
			});
		});

	}

}
