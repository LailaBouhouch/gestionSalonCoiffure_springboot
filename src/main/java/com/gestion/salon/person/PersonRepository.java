package com.gestion.salon.person;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface PersonRepository extends PersonBaseRepository<Person>, JpaRepository<Person, Integer>{

	
}
