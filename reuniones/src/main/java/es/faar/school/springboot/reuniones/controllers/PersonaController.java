package es.faar.school.springboot.reuniones.controllers;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.faar.school.springboot.reuniones.models.Persona;

//@RestController
@Controller
@RequestMapping("/personas")

public class PersonaController {

	private static final List<Persona> personas = new ArrayList<>();
	
	static {
		for (int i = 0; i<5;i++) {
			Persona persona = new Persona(i, "Nombre " + i, "Apellido "+i);
			personas.add(persona);
		}
		
	}
	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("personas",personas);
		return "personas";
	}
}
