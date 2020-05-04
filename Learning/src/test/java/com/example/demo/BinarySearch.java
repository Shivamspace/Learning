package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import com.learning.learning.BInarySearchImpl;


@SpringBootTest
@Configuration
class BinarySearch {

	@Autowired
	BInarySearchImpl binarysearch;
	@Test
	void test() {
		int result=binarysearch.search(new int[]{1,2,3}, 4);
		
		assertEquals(3, result);

}
}
