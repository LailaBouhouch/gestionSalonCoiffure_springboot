package com.gestion.salon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestion.salon.employe.Employe;
import com.gestion.salon.employe.EmployeRepository;
import com.gestion.salon.global.JoursSemaine;
import com.gestion.salon.person.Person;
import com.gestion.salon.person.PersonRepository;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.prestation.PrestationRepository;

@SpringBootApplication
public class GestionSalonApplication implements CommandLineRunner {
	
//	@Autowired
//	PersonRepository employeRepo;
	@Autowired
	PrestationRepository prestationRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionSalonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Prestation pr1 = new Prestation(1, "Coloration", 2, 150.);
		Prestation pr2 = new Prestation(2, "Brushing", 0.5, 50);
		Prestation pr3 = new Prestation(3, "Soin Visage", 2, 250);
		Prestation pr4 = new Prestation(4, "Manicure", 1, 150);
		
		prestationRepo.save(pr1);
		prestationRepo.save(pr2);
		prestationRepo.save(pr3);
		prestationRepo.save(pr4);
	}



}
