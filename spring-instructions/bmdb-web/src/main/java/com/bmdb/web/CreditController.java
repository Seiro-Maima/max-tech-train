package com.bmdb.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.bmdb.business.Credit;
import com.bmdb.db.CreditRepo;

@CrossOrigin
@RestController
@RequestMapping("/credits")
public class CreditController {
	
	@Autowired
	private CreditRepo creditRepo;
	
	// list all credits
	@GetMapping("/")
	public List<Credit> getAllCredits(){
		return creditRepo.findAll();
	}
	
	// list credit by id
	@GetMapping("/{id}")
	public Optional getCredit(@PathVariable int id) {
		Optional<Credit> c = creditRepo.findById(id);
		if (c.isPresent()) {
			return c;
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor not found");
		}
	}
	
	// add a credit
	@PostMapping("/")
	public Credit addCredit(@RequestBody Credit c) {
		return creditRepo.save(c);
	}
	
	// update a credit
	@PutMapping("/")
	public Credit updateCredit(@RequestBody Credit c) {
		return creditRepo.save(c);
	}
	
	// delete a credit
	@DeleteMapping("/")
	public Credit deleteCredit(@RequestBody Credit c) {
		creditRepo.delete(c);
		return c;
	}	
	
}
