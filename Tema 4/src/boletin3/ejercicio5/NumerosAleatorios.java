package boletin3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {

	 static Random rand = new Random();
	
	 /**
	  * Metodo que imprime 0 y 1 aleatoriamente hasta el numero de veces indicada
	  * @param times Numero de printeos a realizar por el metodo
	  */
	static void numerosAleatorios(int times) {
		int numero;
		
		for (int i = 0; i < times; i++) {
			numero = rand.nextInt(0,2);
			System.out.println(numero);
		}
	}
	
	/**
	 * Metodo que imprime numeros aleatorios entre 0 y maxVal hasta el numero de veces indicada
	 * @param times Veces que se repite la generación e impresion del numero
	 * @param maxVal Valor que delimita hasta que numero aleatorio se puede generar (No se incluye)
	 */
	static void numerosAleatorios(int times, int maxVal) {
		int numero;
		
		for (int i = 0; i < times; i++) {
			numero = rand.nextInt(0, maxVal);
			System.out.println(numero);
		}
	}
	/**
	 * Metodo que imprime numeros aleatorios entre minVal y maxVal hasta el numero de veces indicada
	 * @param times Veces que se repite la generación e impresion del numero
	 * @param minVal Valor que delimita hasta que numero aleatorio mínimo se puede generar
	 * @param maxVal Valor que delimita hasta que numero aleatorio máximo se puede generar (No se incluye)
	 */
	static void numeroAleatorios(int times, int minVal, int maxVal) {
		int numero;
		
		for (int i = 0; i < times; i++) {
			numero = rand.nextInt(minVal, maxVal);
			System.out.println(numero);
		}
	}
}
