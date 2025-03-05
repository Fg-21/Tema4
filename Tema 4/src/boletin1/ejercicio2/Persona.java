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
	
	/**
	 * Metodo que comprueba la mayoría de edad de la persona
	 * @return true si es mayor de edad y false si no lo es
	 */
	public boolean esMayorDeEdad() {
		return this.edad >= 18 ? true : false;
	}
	
	/**
	 * Metodo que comprueba si la persona está jubilada basándose en la edad
	 * @return true si tiene mas de 65 años y false si no
	 */
	public boolean esJubilado() {
		return this.edad >= 65 ? true : false;
	}	
	
	/**
	 * Metodo para calcular la diferencia de edad entre 2 personas
	 * @param p Persona con la que se va a diferenciar la edad
	 * @return Devuelve la diferencia de edad entre la persona invocante y la pasada como parámetro
	 */
	public int diferenciaEdad(Persona p) {
		return Math.abs(this.edad - p.edad);
	}
	
	/**
	 * Metodo para revelar los atributos del objeto en forma de cadena
	 * @return Cadena con los atributos del objeto y sus valores
	 */
	public String toString() {
		return "DNI: " + this.dni + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad;
	}
	
	
}
