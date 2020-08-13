package com.gestion.salon.person;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.salon.prestation.Prestation;

@Transactional
public interface PersonRepository extends PersonBaseRepository<Person>, JpaRepository<Person, Integer>{

//	Person findById(Integer id);
	Person findByNom(String nom);
//	Iterable<Person> findByDuree(Double duree);

//	Iterable<T> findAll();
//	Iterable<T> findAll(Sort sort);
//	Page<T> findAll(Pageable pageable);

}
