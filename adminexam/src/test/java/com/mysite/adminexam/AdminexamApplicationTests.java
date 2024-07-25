package com.mysite.adminexam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdminexamApplicationTests {
	
	@Autowired
	private BoardRepository boardrepository;
	
	@Test
	void contextLoads() {
		
	}

}
