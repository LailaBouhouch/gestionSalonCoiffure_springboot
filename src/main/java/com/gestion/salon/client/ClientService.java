package com.gestion.salon.client;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

	@Autowired
    private ClientRepository clientRepository;
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	
	public void deleteClientById(int id) {
		try {
			clientRepository.deleteById(id);			
		} catch (Exception e) {
			throw new Error("delete unsuccessful!");
		}
	}
	
	public Iterable<Client> getAllClient(){
		return clientRepository.findAll();
	}
	
	public Client getClientById(int id) {
		try {			
			Optional<Client> client = clientRepository.findById(id);
			return client.get();
		} catch (Exception e) {
			throw new Error("Invalid save");
		}
	}
	
	public Client updateClient(int id,Client client) {
		try {			
			Client client1 = clientRepository.findById(id).get();
			client1.setNom(client.getNom());
			client1.setPrenom(client.getPrenom());
			client1.setEmail(client.getEmail());
			client1.setTelephone(client.getTelephone());
			client1.setPassword(client.getPassword());
			return clientRepository.save(client1);
		} catch (Exception e) {
			throw new Error("update unsuccessful!");
		}
	}
	
	
}
