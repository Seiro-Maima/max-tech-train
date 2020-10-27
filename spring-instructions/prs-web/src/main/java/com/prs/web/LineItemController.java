 package com.prs.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.prs.business.LineItem;
import com.prs.business.Request;
import com.prs.db.LineItemRepo;
import com.prs.db.RequestRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/lines")
public class LineItemController {

	@Autowired
	private LineItemRepo lineItemRepo;
	@Autowired
	private RequestRepo requestRepo;
	
	

	
	
	// ----------------------------------------
	// list all lineItems
	@GetMapping("")
	public List<LineItem> getAllLineItems(){
		return lineItemRepo.findAll();
	}
	// ----------------------------------------


	// list line item by id
	@GetMapping("/{id}")
	public Optional<LineItem> getLineItem(@PathVariable int id){
		Optional<LineItem> l = lineItemRepo.findById(id);
		if(l.isPresent()) {
			return l;
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Line item not found.");
		}
	}
	
	// -----------------------------------------------
	// requirement is to add line item via request id
	
	@PostMapping("/{reqid}")
	public LineItem addLineItem(@RequestBody LineItem l, @PathVariable int reqid) {
			lineItemRepo.save(l);
			
			//recalculate value after updating
			recalculateRequestTotal(l.getRequest());
			
			return l;
	}
	// ------------------------------------------------
	
	// update a line item
	@PutMapping("/{id}")
	public LineItem updateLineItem(@RequestBody LineItem l, @PathVariable int id) {
		if(id == l.getId()) {
			return lineItemRepo.save(l);
			//recalculate value after updating
//			recalculateRequestTotal(l.getRequest());	// why can't i access this?
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to update. Line item id does not match.");
		}
	}
	
	// delete a line item
	@DeleteMapping("/{id}")
	public Optional<LineItem> deleteLineItem(@PathVariable int id) {
		Optional<LineItem> l = lineItemRepo.findById(id);
		if(l.isPresent()) {
			lineItemRepo.deleteById(id);
			
			//recalculate value after deleting
			recalculateRequestTotal(l.get().getRequest());
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to delete. Line item id does not match.");			
		}
		return l;
	}
	
	// ------------------------------------------------

	// custom method to recalculate Request total
	private void recalculateRequestTotal (Request r) {
		
		// get list of all line items
		List <LineItem> lineList = lineItemRepo.findByRequestId(r.getId());
		
		// initialize total to 0, so it's always recalculated properly
		double total = 0.0;
		
		// loop through list to sum a total
		for(LineItem li: lineList) {
			//line item -> product -> price
			// line item total : product price * quantity
			double lineItemTotal = li.getProduct().getPrice() *  li.getQuantity();
			// add all line items
			total = total + lineItemTotal;
		}
		
		// save total in Request instance
		r.setTotal(total);
		requestRepo.save(r);
	
	}
	

	
}
