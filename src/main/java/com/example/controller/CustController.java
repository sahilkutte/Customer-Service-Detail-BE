package com.example.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Customer;
import com.example.service.CustoSer;

import jakarta.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustController {

	@Autowired
	private CustoSer service;

	
	@GetMapping("{id}")
	public Optional<Customer> taak(@PathVariable Integer id) {
		return service.get(id);
	}
	
	@PostMapping
	public  Customer sav(@Valid @RequestBody Customer cust) {
		return service.add(cust);
	}


	@GetMapping
	public Iterable<Customer> takeall() {
		return service.getall();
	}

	@PutMapping("{id}")
	public Customer updat(@PathVariable Integer id,@Valid @RequestBody Customer cust) {
		return service.update(id, cust);
	}

	@DeleteMapping("{id}")
	public void deletee(@PathVariable Integer id) {
		service.deletee(id);
	}

}
