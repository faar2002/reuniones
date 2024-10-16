package es.faar.school.springboot.reuniones.services;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.faar.school.springboot.reuniones.models.Persona;
import es.faar.school.springboot.reuniones.models.Reunion;

@Service
public class ReunionService {
	private static final List<Reunion> reuniones = new ArrayList<>();
	
	static {
		for (int i = 0; i<5;i++) {
			Reunion reunion = new Reunion(i,"Reunion " + i, ZonedDateTime.now().plusDays(i));
			for (int j = 0; j < i; j ++) {
				reunion.addAsistente(new Persona(i+j, "nombre " +i+j, " Apellido " +i+j));
			}
			reuniones.add(reunion);
		}
		
	}
	
	public List<Reunion> getAllReuniones(){
		return reuniones;
		
	}
}
