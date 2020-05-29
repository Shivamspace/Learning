package com.learning.learning.Springboot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HardcodedEmployee {

	public static List<Employee> employee = new ArrayList<Employee>();

	static int idcounter = 1;

	static {

		employee.add(new Employee(idcounter++, 23, "shivam", new Date()));
		employee.add(new Employee(idcounter++, 23, "Mayank", new Date()));
		employee.add(new Employee(idcounter++, 24, "Anuj", new Date()));

	}

	public List<Employee> findAll() {
		return employee;
	}

	public Employee findById(int id) {

		for (Employee employees : employee) {
			if (employees.getEmployeeId() == id) {

				return employees;
			}

		}
		return null;

	}

	public Employee deleteById(int id) {
		Employee todo = findById(id);

		if (todo == null)
			return null;

		if (employee.remove(todo)) {
			return todo;
		}

		return null;
	}

	public Employee save(Employee employees) {

		if (employees.getEmployeeId() != -1) {
			employees.setEmployeeId(idcounter++);
			employee.add(employees);
		} else {
			deleteById(employees.getEmployeeId());
			System.out.println("delted");
			employee.add(employees);
		}

		return employees;
	}

}
