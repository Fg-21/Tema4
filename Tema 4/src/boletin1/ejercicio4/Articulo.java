package boletin1.ejercicio4;

public class Articulo {

	// Atributos de Articulo
	String nombre = "Default_name";
	double precioSinIVA = 0.0;
	final double IVA = 21;
	int cuantosQuedan = 0;

	/**
	 * Constructor para el Articulo
	 * 
	 * @param nombre        Nombre del Artículo, no puede ser nulo, ni venir vacío, ni ser mayor de 20 caracteres
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

}
