package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.demo.business.Pumpkin;

@RestController
@RequestMapping("/tests")
public class TestController {

	// save values added from user to a list
	private List<Pumpkin> pumpkins = new ArrayList<>();
	
	@GetMapping("/")
	public String helloWorld(){
		return "Testing 1, 2, 3 ~!";
	}
	
	// create a pumpkin and initialize values
	@GetMapping("/pumpkin")
	public Pumpkin makePumpkin(){
		Pumpkin p = new Pumpkin(1, "orange", 11.5, 12, 15, true);
		return p;
	}

	// accept multiple parameters from user for pumpkin
	@GetMapping("/pumpkin-1")
	public List<Pumpkin> makePumpkin(@RequestParam int id, @RequestParam String color, 
			@RequestParam double weight, @RequestParam double height, 
			@RequestParam double width, @RequestParam boolean decorated){
		
		Pumpkin p = new Pumpkin(id, color, weight, height, width, decorated);
		
		// add to list
		pumpkins.add(p);
		
		// return list of pumpkins
		return pumpkins;
	}
	// type in URL using the following format:
	// http://localhost:8080/tests/pumpkin-1?id=1&color=red&weight=22&height=10&width=20&decorated=true
	
}
