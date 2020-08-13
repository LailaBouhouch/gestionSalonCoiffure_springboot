package com.gestion.salon.client.rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.salon.global.ResponseEntity;

@RestController
@RequestMapping("rdvs/client")
public class ClientRdvController {

	@Autowired
	private ClientRdvService clientRdvService;
	ResponseEntity responseEntity;
	
    @PostMapping("/rdv")
    public ResponseEntity createRdvForClient(@RequestHeader int idClient, @RequestBody ClientRdvDTO rdvClientDTO) {
    	responseEntity = new ResponseEntity();
    	try {
        	return responseEntity.setMessage(clientRdvService.createRdvForClient(idClient, rdvClientDTO), 200);
    	}catch(Exception e) {
        	return responseEntity.setErrorMessage(e.toString(), 403);
    	}
    }
}
