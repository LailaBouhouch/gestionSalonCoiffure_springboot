package com.gestion.salon.employe;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.salon.global.JoursSemaine;
import com.gestion.salon.person.Person;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.rdv.Rdv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name="Employe")
public class Employe extends Person {

	@Column
	private int nbrMaxClients;
//	@Column
//	private boolean dispo;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "EmployeJoursrepos", joinColumns = @JoinColumn(name = "idEmploye"))
	@Column(name = "joursRepos")
	@Enumerated(EnumType.STRING)
	Collection<JoursSemaine> joursRepos;

	@JsonIgnore
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="prestationId")
	private Prestation prestation;	
	
//	@OneToMany(cascade = CascadeType.ALL) // => Uncomment
//	private List<Rdv> rdvs;
	
}
