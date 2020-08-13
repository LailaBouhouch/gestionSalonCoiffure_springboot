package com.gestion.salon.rdvPrestation;

import java.util.List;

import lombok.Data;

@Data
public class RdvPrestationDTO {
//	private int idPrestation;
//	private int idRdv;
	private List<Integer> prestationsById;
	private List<Integer> employesById; // => fct in employeService : get employee by disponibility in prestation 
}
