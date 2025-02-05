package boletin1.ejercicio4;

public class Articulo {

	// Atributos de Articulo
	private String nombre = "Default_name";
	private double precioSinIVA = 0.0;
	public static final double IVA = 21;
	private int cuantosQuedan = 0;

	/**
	 * Constructor para el Articulo
	 * 
	 * @param nombre        Nombre del Artículo, no puede ser nulo, ni venir vacío,
	 *                      ni ser mayor de 20 caracteres
	 * @param precioSinIVA  Precio del Articulo sin el IVA, no puede ser negativo
	 * @param cuantosQuedan Número de Artículos que quedan, no puede ser negativo
	 */
	public Articulo(String nombre, double precioSinIVA, int cuantosQuedan) {
		if (nombre != null && !nombre.isEmpty() && nombre.length() < 20) {
			this.nombre = nombre;
		}
		if (precioSinIVA >= 0) {
			this.precioSinIVA = precioSinIVA;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	/**
	 * Getter del nombre del Artículo
	 * 
	 * @return Devuelve el nombre del Artículo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del Artículo
	 * 
	 * @param nombre Modifica el nombre del artículo. No puede ser nulo, ni venir en
	 *               blanco, ni tener más de 20 caracteres
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty() && nombre.length() < 20) {
			this.nombre = nombre;
		}
	}
/**
 * Getter del precio del Artículo sin IVA aplicado
 * @return Devuelve el precio del Artículo sin el IVA aplicado.
 */
	public double getPrecioSinIVA() {
		return precioSinIVA;
	}

	/**
	 * Setter del precio del Artículo sin IVA aplicado
	 * @param precioSinIVA Modifica el precio del Artículo sin el IVA aplicado. No puede ser menor que 0
	 */
	public void setPrecioSinIVA(double precioSinIVA) {
		if (precioSinIVA >= 0) {
			this.precioSinIVA = precioSinIVA;
		}
	}

	/**
	 * Getter de la cantidad de artículos que quedan
	 * @return Devuelve la cantidad de artículos que quedan
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
/**
 * Setter de la cantidad de artículos que quedan
 * @param cuantosQuedan Modifica la cantidad de artículos que quedan. No puede ser menor que 0
 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}
