package com.learning.learning.Springboot.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.learning.Springboot.Employee;

@RestController
@RequestMapping("/customer")
public class CustomerService {

	@Autowired
	CustomerDao customerdao;
	Date date = new Date();

	@GetMapping("/customers")
	public List<Employee> get() {
		return (List) customerdao.findAll();
	}

	@GetMapping("/create")
	public Customer createEmployee() {
		System.out.println("insertion Successful!!!!");
		return customerdao.save(new Customer(24, "Shivam.", date));

	}
}
