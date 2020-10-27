package com.prs.web;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.prs.business.Request;
import com.prs.business.User;
import com.prs.db.RequestRepo;
import com.prs.db.UserRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/requests")
public class RequestController {
	
	// constants for request statuses
	static final String REQUEST_NEW		 = "New";
	static final String REQUEST_REVIEW 	 = "Review";
	static final String REQUEST_APPROVED = "Approved";
	static final String REQUEST_REJECTED = "Rejected";
	
	@Autowired
	private RequestRepo requestRepo;
	@Autowired
	private UserRepo userRepo;
	
	// list all requests
	@GetMapping("")
	public List<Request> getAllRequests(){
		return requestRepo.findAll();
	}

	// list request by id
	@GetMapping("/{id}")
	public Optional<Request> getRequest(@PathVariable int id){
		Optional<Request> r = requestRepo.findById(id);
		if(r.isPresent()) {
			return r;
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Request not found.");
		}
	}
	
	
	// --------------- UNDER CONSTRUCTION BELOW -----------------
	// list requests that are set to "review" and doesn't belong to logged in user
	@GetMapping("/reviews/{userid}")
	public List<Request> getAllRequests(@PathVariable int userid){
		// DUDE - DON'T FORGET ADD ERROR CHECKING HERE! 

		return requestRepo.findByStatusAndUserIdNot(REQUEST_REVIEW, userid);
	}
		
	// set request to review
	@PutMapping("/review")
	public Request setRequestReview(@RequestBody Request r) {
			// set to review unless under $50 then set to approved
			if(r.getTotal() <= 50) {	
				r.setStatus(REQUEST_APPROVED);
			}else {
				r.setStatus(REQUEST_REVIEW);
			}
			return requestRepo.save(r);
	}
	
	// set request to approved
	@PutMapping("/approvee")
	public Request setRequestApprove(@RequestBody Request r) {
			r.setStatus(REQUEST_APPROVED);
			return requestRepo.save(r);
	}
	
	// set request to rejected
	@PutMapping("/rejectt")
	public Request setRequestReject(@RequestBody Request r) {
			r.setStatus(REQUEST_REJECTED);
			return requestRepo.save(r);
	}
	
	// --------------- UNDER CONSTRUCTION ABOVE -----------------

	
	
	
	
	
	
	// add a request
	@PostMapping("")
	public Request addRequest(@RequestBody Request r) {
		// when adding a request, the status should have dateTime
		LocalDateTime submittedDate = LocalDateTime.now();
		r.setDateSubmitted(submittedDate);
		// when adding a request, the status should be "New"
		r.setStatus(REQUEST_NEW);
		
		return requestRepo.save(r);

	}
	
	// update a request
	@PutMapping("/{id}")
	public Request updateRequest(@RequestBody Request r, @PathVariable int id) {
		if(id == r.getId()) {
			return requestRepo.save(r);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to update. Request id does not match.");
		}
	}
	
	// delete a request
	@DeleteMapping("/{id}")
	public Optional<Request> deleteRequest(@PathVariable int id) {
		Optional<Request> r = requestRepo.findById(id);
		if(r.isPresent()) {
			requestRepo.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to delete. Request id does not match.");			
		}
		return r;
	}
	
}
