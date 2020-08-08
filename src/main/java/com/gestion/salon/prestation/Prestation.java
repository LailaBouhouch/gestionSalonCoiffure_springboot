package com.gestion.salon.prestation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.gestion.salon.employe.Employe;
import com.gestion.salon.rdvPrestation.RdvPrestation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prestation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private double duree;
	@Column
	private double prix;
	
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Employe> employes;
	
	@OneToMany(mappedBy = "prestation",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<RdvPrestation> rdvs = new ArrayList<>();
	

}
