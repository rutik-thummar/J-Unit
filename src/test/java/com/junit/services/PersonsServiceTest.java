package com.junit.services;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.junit.repository.PersonRepository;

@ExtendWith(MockitoExtension.class)
public class PersonsServiceTest {

	@Mock
	private PersonRepository personRepository;

	@Autowired
	private PersonService personService;

	@BeforeEach
	void setUp() {
		this.personService = new PersonService(this.personRepository);
	}

	@Test
	void getAllPerson() {
		personService.getAllPerson();
		verify(personRepository).findAll();
	}

}
