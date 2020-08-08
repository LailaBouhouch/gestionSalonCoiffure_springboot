package com.gestion.salon.person;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

//@Repository
@NoRepositoryBean

public interface PersonBaseRepository<T extends Person> extends JpaRepository<T, Integer>{

	public T findByNom(String nom);
	//		Iterable<Prestation> findByDuree(Double duree);
	//		Iterable<Prestation> findByPrix(Double prix);
	//
	////		Iterable<T> findAll();
	////		Iterable<T> findAll(Sort sort);
	////		Page<T> findAll(Pageable pageable);
	////		@Query("select u from #{#entityName} as u where u.email = ?1 ")
	////		T findByEmail(String email);
}
