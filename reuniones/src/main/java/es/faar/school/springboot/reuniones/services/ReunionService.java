package es.faar.school.springboot.reuniones.services;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import es.faar.school.springboot.reuniones.data.ReunionRepository;
import es.faar.school.springboot.reuniones.models.Reunion;

@Service
public class ReunionService {
	private static final List<Reunion> reuniones = new ArrayList<>();
	
	private final ReunionRepository reunionRepository;
	
	
	public ReunionService(ReunionRepository reunionRepository) {
		this.reunionRepository = reunionRepository;
	}


	public List<Reunion> getAllReuniones(){
		return reunionRepository.findAll();
		
	}


	public Optional<Reunion> getById(long idReunion) {
		
		return reunionRepository.findById(idReunion);
	}
}
