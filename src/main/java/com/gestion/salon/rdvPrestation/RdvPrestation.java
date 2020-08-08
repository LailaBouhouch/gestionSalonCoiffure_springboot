package com.gestion.salon.rdvPrestation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

//import com.example.employe.Employe;
//import com.example.prestation.Prestation;
//import com.example.rdv.Rdv;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.rdv.Rdv;

import lombok.Data;

@Data
@Entity
public class RdvPrestation {
	
	@Id
	@JsonIgnore
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
    @MapsId("rdvId")
    private Rdv rdv;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("prestationId")
    private Prestation prestation;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@MapsId("employeId")
//    private Employe employe;
	
    @Column
	private Date heureDebutPrestation;
    @Column
  	private Date heureFinPrestation;
}
