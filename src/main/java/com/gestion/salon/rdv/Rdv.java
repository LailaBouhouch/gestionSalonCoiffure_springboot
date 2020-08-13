package com.gestion.salon.rdv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.salon.client.Client;
import com.gestion.salon.devis.Devis;
import com.gestion.salon.prestation.Prestation;
import com.gestion.salon.rdvPrestation.RdvPrestation;

import lombok.Data;

@Data
@Entity
public class Rdv {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    @Column
    private Date date = new Date();
    
//    @OneToMany(mappedBy = "rdv",
//        cascade = CascadeType.ALL)
//    private List<RdvPrestation> prestations = new ArrayList<>();
    
    @OneToOne
    private Devis devis;
  
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="clientId")
	private Client client;	
	
}
