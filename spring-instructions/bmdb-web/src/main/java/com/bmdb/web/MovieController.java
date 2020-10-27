package com.bmdb.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.bmdb.business.Movie;
import com.bmdb.db.MovieRepo;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieRepo movieRepo;
	
	// list all movies
	@GetMapping("/")
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	// list movie by id
	@GetMapping("/{id}")
	public Optional<Movie> getMovie(@PathVariable int id) {
		Optional<Movie> m = movieRepo.findById(id);
		
		if (m.isPresent()) {
			return m;
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found.");
		}
	}
	
	// add a movie
	@PostMapping("/")
	public Movie addMovie(@RequestBody Movie m) {
		return movieRepo.save(m);
	}
	
	// update a movie
	@PutMapping("/")
	public Movie updateMovie(@RequestBody Movie m) {
		return movieRepo.save(m);
	}
	
	// delete a movie
	@DeleteMapping("/")
	public Movie deleteMovie(@RequestBody Movie m) {
		movieRepo.delete(m);
		return m;
	}	
	
}
