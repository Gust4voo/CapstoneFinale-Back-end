package com.gustavo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.DTO.PrenotazioneSalvataggioDTO;
import com.gustavo.Service.PrenotazioneService;

@RequestMapping("/prenotazioni")
@RestController

public class PrenotazioneController {
	
@Autowired
PrenotazioneService service;

@PutMapping()
public ResponseEntity<?> salvaOModificaPrenotazione(@RequestBody PrenotazioneSalvataggioDTO dto){
	return new ResponseEntity<>(service.salvaOModifica(dto),HttpStatus.OK);
}









}
