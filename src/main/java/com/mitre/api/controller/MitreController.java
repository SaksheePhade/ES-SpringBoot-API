package com.mitre.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mitre.api.model.MitreModel;
import com.mitre.api.repository.MitreRepository;

@RestController
public class MitreController {
	
	@Autowired
	private MitreRepository repository;
	
	@GetMapping("/findAll")
	public Iterable<MitreModel> findAllTechniques() {
		return repository.findAll();
	}

	@GetMapping("/findByID/{ID}")
	public List<MitreModel> findByID(@PathVariable String ID) {
		return repository.findByID(ID);
	}
	
	
	/*
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<MitreModel> customers) {
		repository.saveAll(customers);
		return customers.size();
	}*/

}
