package com.learning.learning.Springboot.jpa;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:3000")
public class CustomerService {

	@Autowired
	CustomerDao customerdao;
	Date date = new Date();

	
	@GetMapping("/customers")
	public List<List> get() {
		
		
	
		return (List) customerdao.findAll();
	}

	@GetMapping("/customers/{id}")
	public Optional<Customer> getbyID(@PathVariable("id") int id) {

		return customerdao.findById(id);
	}

//	@GetMapping("/creating")
//	public Customer createEmployee() {
//		System.out.println("insertion Successful!!!!");
//		return customerdao.save(new Customer(24, "Shivam.", date));
//
//	}
	@PostMapping("/create")
	public Customer createEmployee( @RequestBody Customer customer) {
		System.out.println("insertion Successful!!!!");
		
		return customerdao.save(customer);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateTodo(
			
			@PathVariable long id, @RequestBody Customer todo){
		
		Customer todoUpdated = customerdao.save(todo);
		
		return new ResponseEntity<Customer>(todo, HttpStatus.OK);
	}
	@PutMapping("/edit")
	public Customer updateEmployee( @RequestBody Customer customer) {
		System.out.println("updaning record");
		//System.out.println(customer.getCustomerid());
		//customerdao.deleteById(customer.getEmployeeId());
		return customerdao.save(customer);

	}
	@GetMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		System.out.println("delete Successful!!!!");
		customerdao.deleteById(id);
		;

	}
	@PatchMapping("/updatename/{id}")
	 
	  public Customer patchArticle(@RequestBody Customer customer,@PathVariable("id") int id) {
	      System.out.println(customer.toString());
	      Optional<Customer> findById = customerdao.findById(id);
	      System.out.println(findById);
	      findById.get().setName(customer.getName());
	      customerdao.save(findById.get());
	      return findById.get();
	  }
}
