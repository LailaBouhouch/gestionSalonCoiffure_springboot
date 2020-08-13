package com.gestion.salon.client;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.salon.employe.Employe;
import com.gestion.salon.person.PersonBaseRepository;

@Transactional
public interface ClientRepository extends PersonBaseRepository<Client> {

}
