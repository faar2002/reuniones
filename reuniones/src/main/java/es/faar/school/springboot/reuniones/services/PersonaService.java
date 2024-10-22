package es.faar.school.springboot.reuniones.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.faar.school.springboot.reuniones.data.PersonaRepository;
import es.faar.school.springboot.reuniones.models.Persona;

@Service
public class PersonaService {

	private final PersonaRepository personaRepository;
	
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}


	public List<Persona> getAllPersonas(){
		return personaRepository.findAll();
	}
}
