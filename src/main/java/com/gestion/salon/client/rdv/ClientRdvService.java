package com.gestion.salon.client.rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.salon.client.Client;
import com.gestion.salon.client.ClientService;
import com.gestion.salon.rdv.Rdv;
import com.gestion.salon.rdv.RdvService;

@Service
public class ClientRdvService {

	@Autowired
	private ClientService clientService;
	@Autowired 
	private RdvService rdvService;
	
	public Client createRdvForClient(int idClient, ClientRdvDTO rdvClientDTO) {
		Rdv rdv = rdvService.getRdvById(rdvClientDTO.getIdRdv());
		Client client = clientService.getClientById(idClient);
		client.getRdvs().add(rdv);
		return clientService.saveClient(client);
	}

}
