package es.faar.school.springboot.reuniones.models;

public class Persona {
	private long id;
	private String nombre;
	private String apellidos;
	
	public Persona() {
		
	}
	
	public Persona(long id, String nombre, String apellidos ) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
