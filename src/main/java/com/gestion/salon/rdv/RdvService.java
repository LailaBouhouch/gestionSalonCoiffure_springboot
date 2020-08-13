package com.gestion.salon.rdv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.salon.client.Client;
import com.gestion.salon.client.ClientRepository;
import com.gestion.salon.employe.EmployeRepository;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.prestation.PrestationRepository;
import com.gestion.salon.rdvPrestation.RdvPrestation;


@Service
public class RdvService {
	
	@Autowired
    private RdvRepository rdvRepository;
	@Autowired
    private PrestationRepository prestationRepository;
	@Autowired
	private EmployeRepository employeRepository;
	@Autowired
	private ClientRepository clientRepository;
	Rdv rdv;
	List<Rdv> rdvs = new ArrayList<Rdv>();
	Client clt;
	RdvPrestation rdvPrestation;
	List<RdvPrestation> rdvPrestations = new ArrayList<RdvPrestation>();
	
	
	public Rdv saveRdv(RdvDTO rdvDTO) {
		clt = clientRepository.findById(rdvDTO.getIdClient()).get();
		rdv = new Rdv();
		rdv.setClient(clt);
		rdv.setDate(rdvDTO.getDate());
		rdvs = clt.getRdvs();
		rdvs.add(rdv);
		clt.setRdvs(rdvs);
		return rdvRepository.save(rdv);
	}
	
	public Rdv updateRdvStatus(Rdv rdv) {
		return rdvRepository.save(rdv);
	}
	
	public String deleteRdvById(int id) {
		rdvRepository.deleteById(id);
		return "deleted successful!";
	}
	
	public Iterable<Rdv> getAllRdv(){
		return rdvRepository.findAll();
	}
	
	public Rdv getRdvById(int id) {
		Optional<Rdv> rdv = rdvRepository.findById(id);
		return rdv.get();
	}
	
	

}
