package com.gestion.salon.rdvPrestation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvPrestationRepository extends JpaRepository<RdvPrestation, Integer>{

}
