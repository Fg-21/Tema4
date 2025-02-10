package boletin2.ejercicio1;

public class CuentaCorriente {

	// DNI de la cuenta Corriente
	private String dni;

	// Nombre de la cuenta
	private String nombre;

	// Saldo que tiene la cuenta
	private int saldo;

	private nacionalidad nacion;

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

	CuentaCorriente(String dni, String nombre, int saldoInicial,  nacionalidad nacion){
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

}
