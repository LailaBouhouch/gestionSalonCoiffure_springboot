package com.gestion.salon.rdvPrestation;

import java.util.List;

import lombok.Data;

@Data
public class ListRdvPrestationDTO {
//	private int idPrestation;
//	private int idRdv;
	private List<RdvPrestationDTO> rdvPrestationsDTO;
}
