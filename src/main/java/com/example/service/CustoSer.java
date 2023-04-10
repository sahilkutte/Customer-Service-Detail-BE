package com.example.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Customer;
import com.example.repo.CostRepo;

@Service
public class CustoSer {
	
	@Autowired
	private CostRepo repo;
	
	public Customer add(@Valid Customer cust)
	{
		return repo.save(cust);
	}
	
	public Customer update(Integer id,Customer cust)
	{
		Optional<Customer> cust1=repo.findById(id);
		Customer cust2=cust1.get();
		cust2.setId(cust.getId());
		cust2.setName(cust.getName());
		cust2.setSurname(cust.getSurname());
		cust2.setMobileno(cust.getMobileno());
		cust2.setAddress(cust.getAddress());
		return repo.save(cust2);
	}  
	
	public Optional<Customer> get(Integer id)
	{
		return repo.findById(id);
	}
	
	public Iterable<Customer> getall()
	{
		return repo.findAll();
	}
	
	public void deletee(Integer id)
	{
		repo.deleteById(id);
	}
}


