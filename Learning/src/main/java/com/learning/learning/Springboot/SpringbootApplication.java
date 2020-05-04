package com.learning.learning.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication //implements CommandLineRunner
{
	@Autowired
	EmployeeDao empdao;

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);

		//RestService rest = new RestService();

		//System.out.println(rest.getEmployee());

	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(empdao.findall());
//
//	}

}
