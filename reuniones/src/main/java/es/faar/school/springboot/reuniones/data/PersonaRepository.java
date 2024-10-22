package es.faar.school.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;

import es.faar.school.springboot.reuniones.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
