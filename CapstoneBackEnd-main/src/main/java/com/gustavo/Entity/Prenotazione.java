package com.gustavo.Entity;

import java.time.LocalDate;

import com.gustavo.pacchetto_sicurezza.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="prenotazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private User utente;
	
	private LocalDate andata;
	
	private LocalDate ritorno;
	
	@Column(name="numero_persone")
	private Integer numeroPersone;
	
	
	
	
	
	
	
	
	
}
