package com.gestion.salon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.salon.global.ResponseEntity;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
    ClientService clientService;
	ResponseEntity responseEntity;
    
    @GetMapping("/")
    public ResponseEntity getClients() {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(clientService.getAllClient(), 200);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity getClient(@PathVariable("id") final int id) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(clientService.getClientById(id), 200);
    }
    
    @GetMapping("/nom/{nom}")
    public ResponseEntity getClientByNom(@PathVariable("nom") final String nom) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(clientService.getClientByNom(nom), 200);
    }
    
    @PostMapping("")
    public ResponseEntity createClient(@RequestBody Client client) {
    	try {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setMessage(clientService.saveClient(client), 200);
    	}catch(Exception e) {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setErrorMessage(e.getMessage(), 403);
    	}
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable("id") final int id) {
    	responseEntity = new ResponseEntity();
    	clientService.deleteClientById(id);
    	return responseEntity.setMessage("deleted successfully:", 200);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity updateClient(@PathVariable("id") final int id, @RequestBody Client client) {
    	try{
    		responseEntity = new ResponseEntity();
        	return responseEntity.setMessage(clientService.updateClient(id, client), 200);
    	}catch(Exception e) {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setErrorMessage("update unsuccessfully", 403);
    	}
    }
    

}
