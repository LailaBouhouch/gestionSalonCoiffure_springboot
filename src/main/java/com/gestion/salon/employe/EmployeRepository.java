package com.gestion.salon.employe;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.salon.person.Person;
import com.gestion.salon.person.PersonBaseRepository;
import com.gestion.salon.person.PersonRepository;
import com.gestion.salon.prestation.Prestation;

//@Repository
@Transactional
public interface EmployeRepository extends PersonBaseRepository<Employe>{
	
	Iterable<Employe> findByNbrMaxClients(int max);
	Iterable<Employe> findByPrestationId(int id);
//	Iterable<Employe> findByJoursRepos(Collection<JourSemaine>); => TODO: # afficher les employés qui travaillent aujourd'hui
	Iterable<Employe> findByPrestation(Prestation prestation);

}
