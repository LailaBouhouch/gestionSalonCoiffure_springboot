package com.gestion.salon.rdvPrestation;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import com.example.employe.Employe;
//import com.example.prestation.Prestation;
//import com.example.rdv.Rdv;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.salon.employe.Employe;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.rdv.Rdv;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RdvPrestation {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Rdv rdv;

	@ManyToOne(cascade = CascadeType.ALL)
	private Prestation prestation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employe employe;

	@Column
	private Date heureDebutPrestation;
	@Column
	private Date heureFinPrestation;
}
