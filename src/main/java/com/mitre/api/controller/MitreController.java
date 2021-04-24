package com.mitre.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/findByTactic/{Tactic}")
	public List<MitreModel> findByTactic(@PathVariable String Tactic) {
		return repository.findByTactic(Tactic);
	}
	
	//Error creating bean with name 'mitreController': Unsatisfied dependency expressed through field 'repository'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mitreRepository' defined in com.mitre.api.repository.MitreRepository defined in @EnableElasticsearchRepositories declared on ElasticsearchRepositoriesRegistrar.EnableElasticsearchRepositoriesConfiguration: Invocation of init method failed; nested exception is org.springframework.data.mapping.PropertyReferenceException:
	 //No property tactic found for type MitreModel! Did you mean 'Tactic'?
	
	
	
	@GetMapping(value = "/findByTacticAndID")
    public List<MitreModel> findByTacticAndID(@RequestParam(value = "Tactic") String Tactic, @RequestParam(value = "ID") String ID) {
        return repository.findByTacticAndID(Tactic, ID);
    }
	
	/*
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<MitreModel> customers) {
		repository.saveAll(customers);
		return customers.size();
	}*/

}
