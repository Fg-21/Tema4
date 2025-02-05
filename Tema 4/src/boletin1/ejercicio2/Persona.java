package boletin1.ejercicio2;

public class Persona {
//Atributos de Persona
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	/**
	 * Constructor de Persona
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad Edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
}

/**
 * Getter de nombre
 * @return Devuleve el nombre de la persona
 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Setter de nombre
	 * @param nombre Modifica el nombre de la persona. No hay condiciones para modificar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
 * Getter de apellidos
 * @return Devuleve los apellidos de la persona
 */
	public String getApellidos() {
		return apellidos;
	}

/**
 * Setter de apellidos
 * @param apellidos Modifica los apellidos de la persona. No hay condiciones para modificar
 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

/**
 * Getter de edad
 * @return Devuleve la edad de la persona
 */
	public int getEdad() {
		return edad;
	}

/**
 * Setter de edad
 * @param edad Modifica la edad de la persona. No hay condiciones para modificar
 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

/**
 * Getter del DNI
 * @return Devuelve el DNI de la persona
 */
	public String getDni() {
		return dni;
	}
	
	
}
