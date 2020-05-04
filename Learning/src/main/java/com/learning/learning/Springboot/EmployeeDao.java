package com.learning.learning.Springboot;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	class employeeMappper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
	}
	
	
	
	
	@Autowired
	JdbcTemplate jdbctemplate;
	private Employee queryForObject;

	public List<Employee> findall() {
		return jdbctemplate.query("Select * from Employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public Employee findbyID(int id) {
		queryForObject = jdbctemplate.queryForObject("select * from employee where employeeid=?", new Object[] { id },
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return queryForObject;
	}

	public int delete(Integer id) {

		System.out.println("Deleted Record with ID = " + id);
		return jdbctemplate.update("delete from employee where employeeid = ?", id);
	}

	public int insert(Employee employee) {

		return jdbctemplate.update("insert into employee (employeeid,name,age,bdate) values(?, ?,?,?);", new Object[] {

				employee.getEmployeeId(), employee.getName(), employee.getAge(),

				new Timestamp(employee.getBdate().getDate()) });
	}

	public int update(Employee employee) {

		return jdbctemplate.update("update employee set name=?, age=?, bdate=? where employeeid=?", new Object[] {

				employee.getName(), employee.getAge(),

				new Timestamp(employee.getBdate().getDate()), employee.getEmployeeId(), });
	}

}
