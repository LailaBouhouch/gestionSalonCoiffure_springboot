//package com.gestion.salon.person;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.gestion.salon.global.ResponseEntity;
//
//
//@RestController
//@RequestMapping("/persons")
//public class PersonController {
//	
//	@Autowired
//    PersonService personService;
//	ResponseEntity responseEntity;
//    
//    @GetMapping("/")
//    public ResponseEntity getPersons() {
//    	responseEntity = new ResponseEntity();
//    	return responseEntity.setMessage(personService.getAllPerson(), 200);
//    }
//    
////    @GetMapping("/{id}")
////    public ResponseEntity getPrestation(@PathVariable("id") final int id) {
////    	responseEntity = new ResponseEntity();
////    	return responseEntity.setMessage(prestationService.getPrestationById(id), 200);
////    }
////    
////    @GetMapping("/nom/{nom}")
////    public ResponseEntity getPrestationByNom(@PathVariable("nom") final String nom) {
////    	responseEntity = new ResponseEntity();
////    	return responseEntity.setMessage(prestationService.getPrestationByNom(nom), 200);
////    }
////    
////    @GetMapping("/duree/{duree}")
////    public ResponseEntity getPrestationByDuree(@PathVariable("duree") final Double duree) {
////    	responseEntity = new ResponseEntity();
////    	return responseEntity.setMessage(prestationService.getPrestationByDuree(duree), 200);
////    }
////    
////    @GetMapping("/prix/{prix}")
////    public ResponseEntity getPrestationByPrix(@PathVariable("prix") final Double prix) {
////    	responseEntity = new ResponseEntity();
////    	return responseEntity.setMessage(prestationService.getPrestationByPrix(prix), 200);
////    }
//    
//    @PostMapping("")
//    public ResponseEntity createPerson(@RequestBody Person person) {
//    	try {
//    		responseEntity = new ResponseEntity();
//        	return responseEntity.setMessage(personService.savePerson(person), 200);
//    	}catch(Exception e) {
//    		responseEntity = new ResponseEntity();
//        	return responseEntity.setErrorMessage(e.getMessage(), 403);
//    	}
//    }
//    
//    @DeleteMapping("/{id}")
//    public ResponseEntity deletePerson(@PathVariable("id") final int id) {
//    	responseEntity = new ResponseEntity();
//    	personService.deletePersonById(id);
//    	return responseEntity.setMessage("deleted successfully:", 200);
//    }
//    
////    @PutMapping("/{id}")
////    public ResponseEntity updatePerson(@PathVariable("id") final int id, @RequestBody Person person) {
////    	try{
////    		responseEntity = new ResponseEntity();
////        	return responseEntity.setMessage(prestationService.updatePerson(id, person), 200);
////    	}catch(Exception e) {
////    		responseEntity = new ResponseEntity();
////        	return responseEntity.setErrorMessage("update unsuccessfully", 403);
////    	}
////    }
//    
//
//
//}
