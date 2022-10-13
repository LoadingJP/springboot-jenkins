package com.codebuff.springbootjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class SpringbootJenkinsApplicationTests {
	
	Logger logger = (Logger) LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		assertEquals(true, true);
	}

}
