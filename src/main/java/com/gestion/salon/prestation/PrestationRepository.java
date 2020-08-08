package com.gestion.salon.prestation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrestationRepository extends JpaRepository<Prestation, Integer>{
	Prestation findByNom(String nom);
	Iterable<Prestation> findByDuree(Double duree);
	Iterable<Prestation> findByPrix(Double prix);

//	Iterable<T> findAll();
//	Iterable<T> findAll(Sort sort);
//	Page<T> findAll(Pageable pageable);
}
