package es.faar.school.springboot.reuniones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.faar.school.springboot.reuniones.services.PersonaService;

//@RestController
@Controller
@RequestMapping("/personas")

public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("personas",personaService.getAllPersonas());
		return "personas";
	}
}
