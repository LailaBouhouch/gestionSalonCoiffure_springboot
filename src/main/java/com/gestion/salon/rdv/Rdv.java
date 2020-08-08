package com.gestion.salon.rdv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.gestion.salon.devis.Devis;
import com.gestion.salon.rdvPrestation.RdvPrestation;

import lombok.Data;

@Data
@Entity
public class Rdv {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    @Column
    private Date date;
    
    @OneToMany(mappedBy = "rdv",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
    private List<RdvPrestation> prestations = new ArrayList<>();
    
    @OneToOne
    private Devis devis;
  
	
}
