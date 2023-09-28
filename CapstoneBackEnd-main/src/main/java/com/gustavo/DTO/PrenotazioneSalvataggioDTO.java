package com.gustavo.DTO;

import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PrenotazioneSalvataggioDTO {
private LocalDate andata;
	
	private LocalDate ritorno;
	
	
	private Integer numeroPersone;

	private String username;
	
	private Long id;
}
