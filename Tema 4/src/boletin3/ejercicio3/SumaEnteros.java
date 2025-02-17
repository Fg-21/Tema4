package boletin3.ejercicio3;

public class SumaEnteros {

	/**
	 * Calcula la suma de todos los numeros desde el 1 hasta el que se le pasa como
	 * parametro de entrada
	 * 
	 * @param num Numero hasta el que tiene que sumar la funcion
	 * @return La suma de todos los numeros desde el 1 hasta num
	 */
	static int suma(int num) {
		int res = 0;
		if (num == 1) {
			res = 1;
		} else {
			res += num + suma(num - 1);
		}
		return res;
	}

	/**
	 * Calcula la suma de todos los numeros desde el num hasta el limit
	 * 
	 * @param num Numero donde empieza a sumar la funcion
	 * @param limit Numero hasta el que tiene que sumar la funcion
	 * @return La suma de todos los numeros desde el num hasta limit
	 */
	static int suma(int num, int limit) {
		int res = 0;
		if (limit == num) {
			res = num;
		} else {
			res = limit + suma(num, limit -1);
		}
		return res;
	}
}
