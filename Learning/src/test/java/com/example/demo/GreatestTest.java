package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import  static org.mockito.Mockito.when;
import com.learning.basics.Datalogic;
import com.learning.basics.greatest;
import org.mockito.junit.MockitoJUnitRunner;

//@Runner(Mockito)
class GreatestTest {

	@Mock
	Datalogic datalogic;

	@InjectMocks
	greatest greatest;

	@Test
	void testingGreatest() {
		
	
		when(datalogic.data()).thenReturn(new int [] {1,2,3,4,5});
		
	int result=	greatest.findGreatestOfAll();
		assertEquals(5, result);

	}

}
