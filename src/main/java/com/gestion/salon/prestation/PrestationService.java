package com.gestion.salon.prestation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestationService {
	
	@Autowired
    private PrestationRepository prestationRepository;
	
	public Prestation savePrestation(Prestation prestation) {
		return prestationRepository.save(prestation);
	}
	
	
	public void deletePrestationById(int id) {
		prestationRepository.deleteById(id);
	}
	
	public Iterable<Prestation> getAllPrestation(){
		return prestationRepository.findAll();
	}
	
	public Prestation getPrestationById(int id) {
		Optional<Prestation> prestation = prestationRepository.findById(id);
		return prestation.get();
	}
	
	public Prestation updatePrestation(int id,Prestation prestation) {
		Prestation prestation1 = prestationRepository.findById(id).get();
		prestation1.setNom(prestation.getNom());
		prestation1.setDuree(prestation.getDuree());
		prestation1.setPrix(prestation.getPrix());
		return prestationRepository.save(prestation1);
	}

	public Prestation getPrestationByNom(String nom) {
		return prestationRepository.findByNom(nom);
	}

	public Iterable<Prestation> getPrestationByDuree(Double duree) {
		return prestationRepository.findByDuree(duree);
	}
	
	public Iterable<Prestation> getPrestationByPrix(Double prix) {
		return prestationRepository.findByPrix(prix);
	}

}
