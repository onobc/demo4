package com.example.demo4;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
		classes = Demo4Application.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Demo4ApplicationTests {

	@Test
	void match(@Autowired TestRestTemplate restTemplate) {
		String foo = restTemplate.getForObject("/uppercase/foo", String.class);
		assertThat(foo).isEqualTo("FOO");
	}
}
