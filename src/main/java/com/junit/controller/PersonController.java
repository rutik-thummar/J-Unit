package com.junit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.services.PersonService;


@RestController
public class PersonController {

	   @Autowired
	    private PersonService personService;

	    @GetMapping("/persons")
	    public ResponseEntity<?> getAllPersons() {
	        return ResponseEntity.ok(this.personService.getAllPerson());
	    }
	
}
