package boletincrud.ej5;

import java.util.HashSet;

public class CuentaCorrienteCRUD {

	static HashSet <CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();
	
	
	/**
	 * Metodo que añade una cuenta al conjunto
	 * @param cuenta Cuenta a añadir
	 * @return True si la añade correctamente y false en caso contrario
	 */
	public static boolean addCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}
	
	/**
	 * Metodo que elimina una cuenta del conjunto
	 * @param cuenta Cuenta a eliminar
	 * @return
	 */
	public static boolean delCuenta(CuentaCorriente cuenta) {
		return cuentas.remove(cuenta);
	}
	
	
	
	
}
