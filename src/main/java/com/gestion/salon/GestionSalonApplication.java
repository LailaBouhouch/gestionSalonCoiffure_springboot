package com.gestion.salon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestion.salon.employe.Employe;
import com.gestion.salon.employe.EmployeRepository;
import com.gestion.salon.global.JoursSemaine;
import com.gestion.salon.person.Person;

@SpringBootApplication
public class GestionSalonApplication implements CommandLineRunner {
	
	@Autowired
	EmployeRepository employeRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionSalonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Person emp1 = new Employe(5, JoursSemaine.SAMEDI);
////				Employe(1, 5, JoursSemaine.LUNDI);
//		emp1.setNom("Laila");
//		
//		employeRepo.save(emp1);
		
		System.out.println(employeRepo.findAll().toString());
		
	}



}
