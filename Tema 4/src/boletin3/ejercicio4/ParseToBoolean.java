package boletin3.ejercicio4;

public class ParseToBoolean {

	/**
	 * Metodo que pasa numeros 0 y 1 de un entero a booleanos
	 * @param num Número a definir para el booleano
	 * @return Booleano con true si num = 1 y false si num = 0
	 */
	static boolean parseToBoolean(int num) {
		boolean res = false;
		
		if (num == 0) {
			res = false;
		} else if (num == 1) {
			res = true;
		}
		return res;
	}
	
	/**
	 * Metodo que pasa cadenas true y false de un String a booleanos
	 * @param cadena Cadena que se convertira a booleano
	 * @return Booleano de la cadena
	 */
	static boolean parseToBoolean(String cadena) {
		boolean res = false;
		
		if (cadena.equals("true")) {
			res = true;
		} else if (cadena.equals("false")) {
			res = false;
		}
		
		return res;
	}
}
