package boletin2.ejercicio3;

public class Alumno {
	//Nombre del alumno
	private String nombre = "Name";
	
	//Media del alumno
	private double media = 0;
	
	/**
	 * Constructor del Objeto alumno
	 * @param nombre Nombre del alumno
	 * @param media Media del alumno
	 */
	Alumno(String nombre, double media){
		this.nombre = nombre;
		this.media = media;
	}

	/**
	 * Getter del nombre del alumno
	 * @return Nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del alumno
	 * @param nombre Nombre del alumno. No puede estar vacío ni ser null
	 */
	public void setNombre(String nombre) {
		if (nombre != "" && nombre != null ) {
			this.nombre = nombre;
		}
	}

	/**
	 * Getter de la media del alumno
	 * @return Media del alumno
	 */
	public double getMedia() {
		return media;
	}
	
	
	/**
	 * Metodo toString que sobreescribe al toString de Object
	 */
	public String toString() {
		return this.nombre + " " + this.media;
	}
	
	
	/**
	 * Método equals que sobreescribe al equals de Object
	 * @param alumno Alumno que se va a comparar con el alumno invocante
	 */
	public boolean equals(Object alumno) {
		boolean iguales = false;
		
		Alumno alumnoParam = (Alumno) alumno;
		
		if (this.nombre.equals(alumnoParam.nombre)) {
			iguales = true;
		}
		
		return iguales;
	}
	
	
}
