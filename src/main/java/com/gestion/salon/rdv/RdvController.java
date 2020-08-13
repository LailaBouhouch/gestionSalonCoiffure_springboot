package com.gestion.salon.rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.salon.global.ResponseEntity;


@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/rdvs")
public class RdvController {
	
	@Autowired
	private RdvService rdvService;
	ResponseEntity responseEntity;
	
//    @GetMapping("/")
//    public ResponseEntity getRdvs() {
//    	responseEntity = new ResponseEntity();
//    	return responseEntity.setMessage(rdvService.getAllRdv(), 200);
//    }
    @GetMapping("/{id}")
    public ResponseEntity getRdvById(@PathVariable("id") final int id ) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(rdvService.getRdvById(id), 200);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteRdvById(@PathVariable("id") final int id ) {
    	responseEntity = new ResponseEntity();
    	return responseEntity.setMessage(rdvService.deleteRdvById(id), 200);
    }
    
    @PostMapping("/")
    public ResponseEntity createRdv(@RequestBody RdvDTO rdvDTO) {
    	responseEntity = new ResponseEntity();
    	try {
        	return responseEntity.setMessage(rdvService.saveRdv(rdvDTO), 200);
    	}catch(Exception e) {
        	return responseEntity.setErrorMessage(e.toString(), 403);
    	}
    }
    
    

}
