package com.pumpkin.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pumpkin.business.Pumpkin;
import com.pumpkin.db.PumpkinRepo;

@CrossOrigin
@RestController
@RequestMapping("/pumpkins")
public class PumpkinController {
	
	@Autowired
	private PumpkinRepo pumpkinRepo;
	
	// list all pumpkins
	@GetMapping("/")
	public List<Pumpkin> getAllPumpkins() {
		return pumpkinRepo.findAll();
	}
	
	// list pumpkin by id
	@GetMapping("/{id}")	// put variable name inside curly bracket
	public Pumpkin getPumpkin(@PathVariable int id) {	// declaring a path variable
		return pumpkinRepo.getOne(id);
	}
	
	// add a pumpkin
	@PostMapping("/")
//	public Pumpkin addPumpkin(Pumpkin p) {
//		if (pumpkinRepo.save(p)!=null) {
//			System.out.println("Pumpkin save was successful");
//		}
//		else {
//			System.out.println("Pumpkin save ISSUE.");
//		}
//		return p;
//		
//	}
	
	public Pumpkin addPumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	
	}
	
	// update a pumpkin
	@PutMapping("/")
	public Pumpkin updatePumpkin(@RequestBody Pumpkin p) {
		return pumpkinRepo.save(p);
	}
	
	// delete a pumpkin
	@DeleteMapping("/")
	public void deletePumpkin(@RequestBody Pumpkin p) {
		pumpkinRepo.delete(p);
	}
	
	
}