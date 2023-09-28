package com.gustavo.Service;

import com.gustavo.pacchetto_sicurezza.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.DTO.PrenotazioneSalvataggioDTO;
import com.gustavo.Entity.Prenotazione;
import com.gustavo.Repository.PrenotazioneRepository;
import com.gustavo.pacchetto_sicurezza.entity.User;
import com.gustavo.pacchetto_sicurezza.repository.UserRepository;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneRepository prenotazioneRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public Prenotazione salvaOModifica(PrenotazioneSalvataggioDTO dto) {
		return dto.getId()==null ? salvaPrenotazione(dto) : modificaPrenotazione(dto);
	}
	
	
	public Prenotazione salvaPrenotazione(PrenotazioneSalvataggioDTO dto) {
	
		User u=userRepository.findByUsername(dto.getUsername());
		Prenotazione p=new Prenotazione();
		p.setAndata(dto.getAndata());
		p.setRitorno(dto.getRitorno());
		p.setUtente(u);
		p.setNumeroPersone(dto.getNumeroPersone());
		 return prenotazioneRepository.save(p);
		
	}
	
	public Prenotazione modificaPrenotazione(PrenotazioneSalvataggioDTO dto) {
		Prenotazione p=prenotazioneRepository.findById(dto.getId()).get();
		if(p==null) {
			throw new ResourceNotFoundException("prenotazione", "id", dto.getId());
		}
		p.setAndata(dto.getAndata());
		p.setRitorno(dto.getRitorno());
		p.setNumeroPersone(dto.getNumeroPersone());
		return prenotazioneRepository.save(p);
	}
	
	
	
	
	
	
	
	
	
	
}
