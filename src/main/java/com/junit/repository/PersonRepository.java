package com.junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.junit.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Query(value = "SELECT CASE WHEN COUNT(person_id) > 0 THEN 'TRUE' ELSE 'FALSE' END FROM junit.Person s WHERE s.person_id = :id", nativeQuery = true)
	Boolean isPersonExitsById(@Param("id") Integer id);

}
