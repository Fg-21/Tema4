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
	
	/**
	 * Metodo que calcula el precio de venta al público (IVA incluido)
	 * @return Devuelve el precio con el iva aplicado
	 */
	public double getPVP() {
		return Math.abs(precioSinIVA + (precioSinIVA * IVA/100));
	}
	
	/**
	 * Metodo que calcula el precio de venta al público (IVA incluido) menos el descuento (%) pasado como parámetro
	 * @param descuento Porcentaje de descuento que se aplica al producto
	 * @return Devuelve el precio con el iva aplicado y con el descuento aplicado
	 */
	public double getPVPDescuento(double descuento) {
		double PVP = getPVP();
		return PVP - (PVP * descuento/100);
	}
	
	/**
	 * Método  vender  que actualiza los atributos del objeto tras vender una cantidad "cantidad"
	 * @param cantidad Cantidad de artículos que se van a vender
	 * @return Devuelve true si se han podido vender o false en caso contrario. Depende del stock del artículo
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cuantosQuedan > cantidad) {
			cuantosQuedan = cuantosQuedan - cantidad;
			vendido = true;
		}
		return vendido;
	}
	
	/**
	 * Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad "cantidad"
	 * @param cantidad Cantidad de artículos que se van a vender
	 */
	public void almacenar(int cantidad) {
		if(cantidad > 0) {
		cuantosQuedan = cuantosQuedan + cantidad;
		}
		}
	
	
	
	/**
	 * Metodo que devuelve la informacion del articulo en una cadena
	 * @return Devuelve la info del articulo en una cadena
	 */
	public String toString() {
		return "Nombre: " + nombre + "\nPrecio sin IVA: " + precioSinIVA + "\nStock: " + cuantosQuedan;
	}
	
	
	
}
