//package com.gestion.salon.person;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PersonService {
//	
//	@Autowired
//    private PersonRepository personRepository;
//	
//	public Person savePerson(Person person) {
//		return personRepository.save(person);
//	}
//	
//	public void deletePersonById(int id) {
//		personRepository.deleteById(id);
//	}
//	
//	public Iterable<Person> getAllPerson(){
//		return personRepository.findAll();
//	}
//	
//	public Person getPersonById(int id) {
//		Optional<Person> person = personRepository.findById(id);
//		return person.get();
//	}
//	
////	public Person updatePerson(int id,Person prestation) {
////		Person prestation1 = prestationRepository.findById(id).get();
////		prestation1.setNom(prestation.getNom());
////		prestation1.setDuree(prestation.getDuree());
////		prestation1.setPrix(prestation.getPrix());
////		return prestationRepository.save(prestation1);
////	}
////
////	public Person getPersonByNom(String nom) {
////		return prestationRepository.findByNom(nom);
////	}
////
////	public Iterable<Person> getPersonByDuree(Double duree) {
////		return prestationRepository.findByDuree(duree);
////	}
////	
////	public Iterable<Person> getPersonByPrix(Double prix) {
////		return prestationRepository.findByPrix(prix);
////	}
//
//}
