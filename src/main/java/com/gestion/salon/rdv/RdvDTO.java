package com.gestion.salon.rdv;

import java.util.Date;
import java.util.List;

import com.gestion.salon.prestation.Prestation;

import lombok.Data;

@Data
public class RdvDTO {

//	private int idRdv;
	private int idClient;
	private Date date;
//	private List<PrestationDebutDTO> prestationDebut;
//	private int idEmploye;
//	private int idPrestation;
//	private List<Integer> idPrestations;
}
