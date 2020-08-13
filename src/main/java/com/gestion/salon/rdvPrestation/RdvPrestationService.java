package com.gestion.salon.rdvPrestation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.salon.employe.Employe;
import com.gestion.salon.employe.EmployeRepository;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.prestation.PrestationRepository;
import com.gestion.salon.rdv.Rdv;
import com.gestion.salon.rdv.RdvRepository;
import com.gestion.salon.rdv.RdvService;

@Service
public class RdvPrestationService {

	@Autowired
	private PrestationRepository prestationRepository;
	@Autowired
	private RdvRepository rdvRepository;
	@Autowired
	private RdvService rdvService;
	@Autowired
	private RdvPrestationRepository rdvPrestationRepository ;
	@Autowired
	private EmployeRepository employeRepository;

	Prestation prestation;
	Rdv rdv;
	RdvPrestation rdvPrestation;
	List<RdvPrestation> rdvPrestations = new ArrayList<>();
//	List<Prestation> prestations = new ArrayList<>();
	public List<RdvPrestation> addPrestationToRdv(int idRdv, RdvPrestationDTO rdvPrestationDTO) {
		System.out.println(idRdv);
		System.out.println(rdvPrestationDTO);
		for(int i = 0; i < rdvPrestationDTO.getPrestationsById().size(); i++) {
			int idPres = rdvPrestationDTO.getPrestationsById().get(i);
			prestation = prestationRepository.findById(idPres).get();
			rdv = rdvService.getRdvById(idRdv);
			rdvPrestation = new RdvPrestation();
			rdvPrestation.setRdv(rdv);
			rdvPrestation.setPrestation(prestation);
			int idEmp = rdvPrestationDTO.getEmployesById().get(i);
			Employe emp = employeRepository.findById(idEmp).get();
			rdvPrestation.setEmploye(emp);
			
			rdvPrestationRepository.save(rdvPrestation);

			rdvPrestations.add(rdvPrestation);
			System.out.println(rdvPrestations.toArray().toString());
		}
		
		return rdvPrestations;
	}
	
	public Iterable<RdvPrestation> getAllRdv(){
		return rdvPrestationRepository.findAll();
	}

}
