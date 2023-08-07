package com.junit.services;




import com.junit.model.Person;
import com.junit.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
	
    @Autowired
    private PersonRepository PersonRepository;

    public List<Person> getAllPerson() {
        return this.PersonRepository.findAll();
    }

    public PersonService(PersonRepository PersonRepository) {
        this.PersonRepository = PersonRepository;
    }
    
//    private int wordCount() {
//    	
//    	mock(fileRead()).thenReturn("hello good morning");
//    	
//    	
//    	String str = fileRead();
//    	
//    	//calculate word login
//    	return 0;
//    }
//    
//    private String fileRead() {
//    	//file reading operation
//    	return "hello good morning";
//    }
}
