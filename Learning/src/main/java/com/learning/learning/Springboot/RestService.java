package com.learning.learning.Springboot;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@Autowired
	EmployeeDao empdao;
	Date date = new Date();

	@RequestMapping("/employee")

	public List<Employee> getEmployee() {
		System.out.println(empdao.findall());

		return empdao.findall();

//		return Arrays.asList(new Employee(23, 23, "Shivam",date),
//				new Employee(23, 23, "Shivam",date),
//				new Employee(23, 23, "Shivam",date));

	}

	@RequestMapping("/employee/{id}")
	public Employee getEmployeebyID(@PathVariable("id") int id) {

		return empdao.findbyID(id);
	}

	@RequestMapping("/employee/delete/{id}")
	public int deleteEmployeebyID(@PathVariable("id") int id) {
		System.out.println("Delete Successful!!!!");
		return empdao.delete(id);
	}

	@RequestMapping("/employee/create")
	public int createEmployee() {
		System.out.println("insertion Successful!!!!");
		return empdao.insert(new Employee(4, 25, "Mayank", date));

	}

	@RequestMapping("/employee/update")
	public int updateEmployee() {
		System.out.println("update Successful!!!!");
		return empdao.update((new Employee(1, 25, "Rahul", date)));

	}
}
