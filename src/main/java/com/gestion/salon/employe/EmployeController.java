package com.gestion.salon.employe;

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
@RequestMapping("/employes")
public class EmployeController {
	
	@Autowired
    EmployeService employeService;
	
	ResponseEntity responseEntity;
    
    @GetMapping("/")
    public ResponseEntity getEmployes() {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(employeService.getAllEmploye(), 200);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity getEmploye(@PathVariable("id") final int id) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(employeService.getEmployeById(id), 200);
    }
    
    @GetMapping("/nom/{nom}")
    public ResponseEntity getEmployeByNom(@PathVariable("nom") final String nom) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(employeService.getEmployeByNom(nom), 200);
    }
    
    @GetMapping("/nbrMaxClients/{nbrMaxClients}")
    public ResponseEntity getEmployeByNbrMaxClients(@PathVariable("nbrMaxClients") final int nbrMaxClients) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(employeService.getEmployeByNbrMaxClients(nbrMaxClients), 200);
    }
    
    @GetMapping("/prestation/{prestation}")
    public ResponseEntity getEmployeByPrestation(@PathVariable("prestation") final String prestation) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(employeService.getEmployeByPrestation(prestation), 200);
    }
    
    @PostMapping("")
    public ResponseEntity createEmploye(@RequestBody Employe employe) {
    	try {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setMessage(employeService.saveEmploye(employe), 200);
    	}catch(Exception e) {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setErrorMessage(e.getMessage(), 403);
    	}
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmploye(@PathVariable("id") final int id) {
    	responseEntity = new ResponseEntity();
    	employeService.deleteEmployeById(id);
    	return responseEntity.setMessage("deleted successfully:", 200);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity updateEmploye(@PathVariable("id") final int id, @RequestBody Employe employe) {
    	try{
    		responseEntity = new ResponseEntity();
        	return responseEntity.setMessage(employeService.updateEmploye(id, employe), 200);
    	}catch(Exception e) {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setErrorMessage("update unsuccessfully", 403);
    	}
    }
    
    @PostMapping("/prestations")
    public ResponseEntity affectPrestationToEmploye(@RequestBody EmployeDTO employeDTO) {
    	try{
    		responseEntity = new ResponseEntity();
        	return responseEntity.setMessage(employeService.affectPrestationToEmploye(employeDTO), 200);
    	}catch(Exception e) {
    		responseEntity = new ResponseEntity();
        	return responseEntity.setErrorMessage("Not Affected", 403);
    	}
    }
    

}
