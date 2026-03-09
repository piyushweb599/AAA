package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

	@GetMapping("calci/add/{a}/{b}")
	int add(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
	//http://localhost:8080/
	@GetMapping("calci/sub/{a}/{b}")
	int sub(@PathVariable int a,@PathVariable int b)
	{
		return a-b;
	}
	@GetMapping("calci/mul/{a}/{b}")
	int mul(@PathVariable int a,@PathVariable int b)
	{
		return a*b;
	}
	@GetMapping("calci/div/{a}/{b}")
	int div(@PathVariable int a,@PathVariable int b)
	{
		return a/b;
	}
}
