package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MokitoDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void getSumTest() {
		
		assertEquals(1, 2, 3);
		
	}

}
