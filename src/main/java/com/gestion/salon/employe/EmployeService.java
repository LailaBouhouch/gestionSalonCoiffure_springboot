package com.gestion.salon.employe;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.salon.global.JoursSemaine;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.prestation.PrestationRepository;


@Service
public class EmployeService {

	
	@Autowired
    private EmployeRepository employeRepository;
	@Autowired
	private PrestationRepository prestationRepository;
	
	Employe employe;
	Prestation prestation;

	public Employe saveEmploye(Employe employe) {
		return employeRepository.save(employe);
	}
	
	public void deleteEmployeById(int id) {
		employeRepository.deleteById(id);
	}
	
	public Iterable<Employe> getAllEmploye(){
		return employeRepository.findAll();
	}
	
	public Employe getEmployeById(int id) {
		Optional<Employe> employe = employeRepository.findById(id);
		return employe.get();
	}
	
	public Employe updateEmploye(int id, Employe employe) {
		try {			
			Employe employe1 = employeRepository.findById(id).get();
			employe1.setNom(employe.getNom());
			employe1.setPrenom(employe.getPrenom());
			employe1.setEmail(employe.getEmail());
			employe1.setTelephone(employe.getTelephone());
			employe1.setPassword(employe.getPassword());
			employe1.setNbrMaxClients(employe.getNbrMaxClients());
			Collection<JoursSemaine> jrReposEmp = employe.getJoursRepos();
			employe1.setJoursRepos(jrReposEmp);
			employe1.setPrestation(employe.getPrestation());
			return employeRepository.save(employe);
		} catch (Exception e) {
			throw new Error("update unsuccessful!");
		}
	}

	public Employe getEmployeByNom(String nom) {
		return employeRepository.findByNom(nom);
	}

	public Iterable<Employe> getEmployeByNbrMaxClients(int max) {
		return employeRepository.findByNbrMaxClients(max);
	}
	
	public Iterable<Employe> getEmployeByPrestation(String prestation) {
		Prestation pr = prestationRepository.findByNom(prestation);
		return employeRepository.findByPrestation(pr);
	}


	public Object affectPrestationToEmploye(EmployeDTO employeDTO) {
		Employe employe = employeRepository.findById(employeDTO.getIdEmploye()).get();
		employe.setPrestation(prestationRepository.findById(employeDTO.getIdPrestation()).get());
		return employeRepository.save(employe);
	}
	
}
