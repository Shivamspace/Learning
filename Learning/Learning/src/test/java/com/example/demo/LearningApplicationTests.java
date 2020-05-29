package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.learning.basics.Summer;

class LearningApplicationTests {

	Summer summmer = new Summer();

	@Test
	void contextLoads() {
		Summer summmer = new Summer();
		int result = summmer.sumOfNumber(new int[] { 1, 2, 3, 4 });

		assertEquals(10, result);
	}
	@Test
	void contextLoads1() {
		Summer summmer = new Summer();
		int result = summmer.sumOfNumber(new int[] { });

		assertEquals(0, result);
	}
	
	
	
	@AfterEach
	void hello() {
		System.out.println("this is after ");
	}
	
	@BeforeEach
	void hi() {
		System.out.println("this is before ");
	}
	
	
	@BeforeTestClass
	
	void hello1() {
		System.out.println("this is before class ");
	}
	
	@AfterTestClass
	void hello1q() {
		System.out.println("this is after class ");
	}
	
	
}
