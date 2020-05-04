package com.learning.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan
public class LearningApplication {

	public static void main(String[] args) {

		// BInarySearchImpl BInarySearchImpl = new BInarySearchImpl(new
		// QuickSortAlgorithm());

		ClassPathXmlApplicationContext appontxt = new ClassPathXmlApplicationContext("applicationContext.xml");

		BInarySearchImpl BInarySearchImpl = appontxt.getBean(BInarySearchImpl.class);
		BInarySearchImpl BInarySearchImp2 = appontxt.getBean(BInarySearchImpl.class);
		System.out.println(BInarySearchImp2);
		int numbers[] = { 1, 2, 3 };
		int result = BInarySearchImpl.search(numbers, 3);
		System.out.println(result);
		BInarySearchImp2.Predestroy();

	}

}
