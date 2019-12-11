package com.demo.junit.prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeJunit {

	@Test
	void PrimeTest() {
		//fail("Not yet implemented");
		Prime junit=new Prime();
		String result=junit.PrimeMethod(2);
		assertEquals("number is prime",result);
	}

}
