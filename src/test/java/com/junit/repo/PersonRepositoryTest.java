package com.junit.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.junit.model.Person;
import com.junit.repository.PersonRepository;

@SpringBootTest
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

	@Test
	void isPersonExitsById() {
		Person person = new Person(8, "rutik1", "surat1");
		
		personRepository.save(person);

		Boolean actualResult = personRepository.isPersonExitsById(person.getPersonId());

		assertThat(actualResult).isTrue();
	}

	@AfterEach
	void tearDown() {
		System.out.println("tearDown");
		//personRepository.deleteAll();
	}

	@BeforeEach
	void setUp() {
		System.out.println("setUp");
	}
}
