package boletincrud.ej5;

import java.util.Objects;

public class CuentaCorriente {

	// DNI de la cuenta Corriente
	private String dni = "No especificado";

	// Nombre de la cuenta
	private String nombre = "No especificado";

	// Saldo que tiene la cuenta
	private int saldo;

	private nacionalidad nacion = nacionalidad.ESPAÑOLA;

	// Nacionalidad del propietario de la cuenta
	enum nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	/**
	 * Constructor de la cuenta corriente con el dni, el titular de la cuenta y el
	 * saldo inicial
	 * 
	 * @param dni          DNI del titular de la cuenta corriente
	 * @param saldoInicial Saldo inicial de la Cuenta corriente
	 */
	CuentaCorriente(String dni, int saldoInicial) {
		this.dni = dni;
		this.saldo = saldoInicial;
	}
	
	CuentaCorriente(String dni, String nombre) {
	this.dni = dni;
	this.nombre = nombre;
	}

	/**
	 * Contructor de la cuenta corriente con el dni, el nombre y el saldo inicial
	 * 
	 * @param dni          DNI de la cuenta corriente
	 * @param nombre       nombre de la cuenta corriente
	 * @param saldoInicial Saldo inicial de la Cuenta corriente
	 */
	CuentaCorriente(String dni, String nombre, int saldoInicial) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldoInicial;
	}

	/**
	 * Constructor de CuentaCorriente con el dni, el nombre, el saldo inicial y la
	 * nacionalidad
	 * 
	 * @param dni          DNI de la Cuenta Corriente
	 * @param nombre       Nombre de la Cuenta Corriente
	 * @param saldoInicial Saldo de la cuenta
	 * @param nacion       Nacionalidad de la persona
	 */
	CuentaCorriente(String dni, String nombre, int saldoInicial, nacionalidad nacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldoInicial;
		this.nacion = nacion;
	}

	/**
	 * Getter del DNI de la cuanta corriente
	 * 
	 * @return Devuelvve el dni de la cuenta corriente
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter del DNI de la cuenta corriente
	 * 
	 * @param dni DNI de la cuenta corriente. No hay condiciones para modificar
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Getter del nombre de la cuenta corriente
	 * 
	 * @return Devuelve el nombre de la cuenta corriente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre de la cuenta corriente
	 * 
	 * @param nombre Nombre de la cuenta corriente. No hay condiciones para
	 *               modificar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del saldo de la cuenta corriente
	 * 
	 * @return Devuelve el saldo de la cuenta corriente
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * Setter del saldo de la cuenta corriente
	 * 
	 * @param saldo Salde de la cuenta corriente. No hay condiciones para modificar
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * Saca el dinero(Parámetro de entrada) del saldo inicial (Invocante). No podrá
	 * sacar dinero si no hay suficiente saldo y devolverá false, de lo contrario,
	 * true
	 * 
	 * @param dinero Dinero que queremos sacar de la cuenta
	 * @return Devuelve true si se ha sacado el dinero y false si no
	 */
	public boolean sacaDinero(int dinero) {
		boolean sacar = false;

		if (dinero <= saldo) {
			saldo = saldo - dinero;
			sacar = true;
		}

		return sacar;
	}
	
	/**
	 * Ingresa dinero en la cuenta corriente. Si ingresamos negativo no se ingresa
	 * @param dinero Dinero que queremos ingresar en la cuenta
	 * @return Devuelve true si ha podido ingresar y false en caso contrario
	 */
	public boolean ingresaDinero(int dinero) {
		boolean ingresa = false;
		
		if(dinero >= 0) {
			saldo = saldo + dinero;
			ingresa = true;
		}
		
		return ingresa;
	}
	
	/**
	 * Devuelve una cadena con la info de la cuenta corriente
	 */
	public String toString() {
		return "DNI: " + dni + "\nNombre: " + nombre + "\nSaldo: " + saldo + "\nNacionalidad: " + nacion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}
	
	/**
	 * Override metodo equals de Object
	 */
	public boolean equals(Object cuenta) {
		boolean iguales = false;
		CuentaCorriente cuenta2 = (CuentaCorriente) cuenta;
		
		if (cuenta2.dni.equals(dni) && cuenta2.nombre.equals(nombre)) {
			iguales = true;
		}
		return iguales;
	}

}
