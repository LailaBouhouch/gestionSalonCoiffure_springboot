package com.gestion.salon.rdvPrestation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.salon.global.ResponseEntity;
import com.gestion.salon.prestation.Prestation;

@RestController
//@CrossOrigin(origins = "http://localhost:8080/rdvs")
@RequestMapping("/rdvs")
public class RdvPrestationController {
	
	@Autowired
	RdvPrestationService rdvPrestationService;
    Prestation prestation;
    ResponseEntity responseEntity;
	
    @GetMapping("/")
    public ResponseEntity getRdvs() {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(rdvPrestationService.getAllRdv(), 200);
    }
    
    @PostMapping("/client/prestations")
    public ResponseEntity addPrestationToRdv(@RequestHeader int idRdv, @RequestBody RdvPrestationDTO rdvPrestationDTO) {
    	responseEntity = new ResponseEntity();
    	try{
			return responseEntity.setMessage(rdvPrestationService.addPrestationToRdv(idRdv, rdvPrestationDTO), 200);
    	}catch(Exception e) {
    		return responseEntity.setErrorMessage(e.toString(), 403);
    	}
    }
    
}