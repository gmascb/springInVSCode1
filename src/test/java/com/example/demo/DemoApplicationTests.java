package com.example.demo;

import static org.junit.Assert.assertEquals;

import com.example.demo.GreetingService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private GreetingService gService;


	@Test
	public void testGreetingService() {
		assertEquals(new Greeting("Hello", "Klaus").frase, gService.helloGreeting("Klaus").frase);
		assertEquals(new Greeting("Hello", "Klaus").name, gService.helloGreeting("Klaus").name);
	}
}
