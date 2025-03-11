package boletin4.ej4;

public class Fraccion {
	
	/**
	 * Numerador de la fraccion
	 */
	private int numerador;
	
	/**
	 * Denominador de la fraccion
	 */
	private int denominador;
	
	
	
	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
	}



	/**
	 * Constructor de la fraccion con todos los atributos
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	
	
	/**
	 * Getter del numerador de la fraccion
	 * @return El numerador de la fraccion
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Getter del denominador de la fraccion
	 * @return Devuelve el denominador de la fraccion
	 */
	public int getDenominador() {
		return denominador;
	}
	
	/**
	 * Metodo que simplifica una fraccion actual
	 */
	public void simplify() {
		
		int mcd = findMcd(this.numerador, this.denominador);
		
		this.numerador = this.numerador / mcd;
		this.denominador = this.denominador / mcd;
	}
	
	/**
	 * Metodo que suma 2 fracciones, la invocante y la pasada por parametro, y al final simplifica el resultado
	 * @param frac Fraccion a sumar a la invocante
	 * @return Devuelve una fraccion de la suma de las dos fracciones simplificada
	 */
	public Fraccion suma(Fraccion frac){
		Fraccion resul = new Fraccion();
		
		if (this.denominador != frac.denominador) {
		resul.denominador = findMcm(this.denominador, frac.denominador);
		resul.numerador = (resul.denominador / this.denominador * this.numerador) + (resul.denominador / frac.denominador * frac.numerador); 
		} else {
			resul.numerador = this.numerador + frac.numerador;
			resul.denominador = frac.denominador;
		}
		
		resul.simplify();
		
		return resul;
	}
	

	/**
	 * Metodo que multiplica la fraccion actual por la pasada como parametro
	 * @param frac Fraccion a multiplicar por la actual
	 * @return Devuelve el producto de ambas fracciones simplificado
	 */
	public Fraccion multiplica (Fraccion frac) {
		Fraccion f1 = new Fraccion();
		f1.numerador = this.numerador * frac.numerador;
		f1.denominador = this.denominador * frac.denominador;
		
		f1.simplify();
		
		return f1;
	}
	
	/**
	 * Metodo que divide la fraccion actual por la pasada como parametro
	 * @param frac Fraccion a dividir por la actual
	 * @return Devuelve el cociente de ambas fracciones simplificado
	 */
	public Fraccion divide (Fraccion frac) {
		Fraccion f1 = new Fraccion();
		f1.numerador = this.numerador * frac.denominador;
		f1.denominador = this.denominador * frac.numerador;
		
		f1.simplify();
		
		return f1;
	}
	
	
	
	
	
	/**
	 * Metodo para calcular el mcm de dos numeros pasados por parametro
	 * @param num1 Primer numero 
	 * @param num2 Segundo numero
	 * @return El minimo comun multiplo de esos dos numeros
	 */
	public int findMcm(int num1, int num2) {
		int mcm = 0;
		int mayor = Math.max(num1, num2);
		mcm = mayor;
		
		while(mcm % num1 != 0 || mcm % num2 != 0) {
			mcm++;
			}

		return mcm;
	}
	
	/**
	 * Metodo para calcular el mcd de dos numeros pasados por parametro
	 * @param num1 Primer numero
	 * @param num2 Segundo numero
	 * @return El maximo comun divisor de esos 2 numeros
	 */
	public int findMcd(int num1, int num2) {
		int mcd = 0;
		int menor = Math.min(num1, num2);
		mcd = menor;
		
		while (num1 % mcd != 0 || num2 % mcd != 0) {
			mcd--;
		}
		
		return mcd;
	}
	
	
	/**
	 * toString para imprimir el numerador y denominador de las fracciones
	 */
	@Override
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
	
	
	
	
		
	
}
