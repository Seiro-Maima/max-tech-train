package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demos")
public class DemoController {

	// hello world
	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello Spring World!";
	}
	
	// adding user name
	@GetMapping("/hello-name")
	public String helloWorld(@RequestParam String name){
		return "Hello " + name + "!";
	}
	
	// providing a default value
	@GetMapping("/hello-name-default")
	public String helloWorldDefault(@RequestParam (defaultValue = "World") String name){
		return "Hello " + name + "!";
	}
	
}
