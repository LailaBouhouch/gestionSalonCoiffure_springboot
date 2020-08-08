package com.gestion.salon.employe;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.salon.person.Person;
import com.gestion.salon.person.PersonBaseRepository;
import com.gestion.salon.person.PersonRepository;

//@Repository
@Transactional
public interface EmployeRepository extends PersonBaseRepository<Employe>{

	// findByNbrMaxClients
}
