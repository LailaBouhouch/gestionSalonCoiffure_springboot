package com.gestion.salon.client;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.gestion.salon.person.Person;
import com.gestion.salon.rdv.Rdv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@DiscriminatorColumn(name="Client")
public class Client extends Person {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
//	@OneToMany()
//	private 
	@OneToMany(cascade = CascadeType.ALL)
	private List<Rdv> rdvs;
}
