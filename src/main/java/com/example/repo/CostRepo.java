package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Customer;

@Repository
public interface CostRepo extends CrudRepository<Customer, Integer> {

}
