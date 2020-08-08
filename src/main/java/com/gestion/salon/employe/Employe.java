package com.gestion.salon.employe;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gestion.salon.global.JoursSemaine;
import com.gestion.salon.person.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name="Employe")
public class Employe extends Person{

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private int id;
	@Column
	private int nbrMaxClients;
	//    @Column
	//	private List<String> joursRepos;	// TODO : Enum<Jours>
	@Column
	@Enumerated(EnumType.ORDINAL)
	private JoursSemaine joursRepos;

}
