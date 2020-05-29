package com.learning.learning.Springboot;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeService {

	@Autowired
	HardcodedEmployee empdao;
	Date date = new Date();

	@RequestMapping("/getemployee")

	public List getEmployee() {
		System.out.println(empdao.findAll());

		return empdao.findAll();

		// return Arrays.asList(new Employee(23, 23, "Shivam",date),
		// new Employee(23, 23, "Shivam",date),
		// new Employee(23, 23, "Shivam",date));

	}

	// @RequestMapping("/sample")
	// public String sample() {
	//
	// return "Message from Sample API";
	// }
	@RequestMapping("/getemployee/{id}")
	public Employee getEmployeebyID(@PathVariable("id") int id) {

		return empdao.findById(id);
	}

	@GetMapping("/getemployee/delete/{id}")
	public Employee deleteEmployeebyID(@PathVariable("id") int id) {

		return empdao.deleteById(id);
	}
	//

	//
	@PostMapping("/getemployee/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println("insertion Successful!!!!");

		return empdao.save(employee);
	}
	@PutMapping("/getemployee/update/{id}")
	public Employee createEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
		System.out.println("insertion Successful!!!!"
				+employee);

		return empdao.save(employee);
	}
	//
	// @RequestMapping("/employee/update")
	// public int updateEmployee() {
	// System.out.println("update Successful!!!!");
	// return empdao.update((new Employee(1, 25, "Rahul", date)));
	//
	// }
}
