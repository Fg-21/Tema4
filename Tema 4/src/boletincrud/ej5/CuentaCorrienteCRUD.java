package boletincrud.ej5;

import java.util.HashSet;

public class CuentaCorrienteCRUD {

	static HashSet<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();

	/**
	 * Metodo que añade una cuenta al conjunto
	 * 
	 * @param cuenta Cuenta a añadir
	 * @return True si la añade correctamente y false en caso contrario
	 */
	public static boolean addCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}

	/**
	 * Metodo que elimina una cuenta del conjunto
	 * 
	 * @param cuenta Cuenta a eliminar
	 * @return
	 */
	public static boolean delCuenta(CuentaCorriente cuenta) {
		return cuentas.remove(cuenta);
	}

	/**
	 * Metodp para ingresar dinero en la cuenta 
	 * @param cuenta Cuenta en la que se va a ingresar el dinero
	 * @param saldo Saldo que se va a ingresar
	 * @return True si el saldo se ingresa y false en caso contrario
	 */
	public static boolean ingresar(CuentaCorriente cuenta, int saldo ) {
		boolean modded = false;
		
		for (CuentaCorriente acc : cuentas) {
		if (acc.equals(cuenta)) {
			acc.setSaldo(acc.getSaldo() + saldo);
			modded = true;
		}
		}
		
		return modded;
	}
	
	/**
	 * Metodp para retirar dinero de la cuenta 
	 * @param cuenta Cuenta en la que se va a retirar el dinero
	 * @param saldo Saldo que se va a retirar
	 * @return True si el saldo se retira y false en caso contrario
	 */
	public static boolean retirar(CuentaCorriente cuenta, int saldo ) {
		boolean modded = false;
		
		for (CuentaCorriente acc : cuentas) {
		if (acc.equals(cuenta) && acc.getSaldo() > saldo) {
			acc.setSaldo(acc.getSaldo() - saldo);
			modded = true;
		}
		}
		
		return modded;
	}
	
	/**
	 * Listado de la cuentas
	 */
	public static void listado() {
		for (CuentaCorriente acc : cuentas) {
			System.out.println(acc);
		}
	}
	

}
