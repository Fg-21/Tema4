package boletin1.ejercicio1;

public class Punto {

	
	//Atributos de Punto
	private int x;
	private int y;
	
	/**
	 * Constructor que asigna las coordenadas
	 * @param x Coordenadas del eje X
	 * @param y Coordenadas del eje Y
	 */
	Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
/**
 * Getter de x
 * @return Devuelve el valor de la coordenada x
 */	
	public int getX() {
		return x;
	}

	/**
	 * Setter de x
	 * @param x Valor de la coordenada x. No tiene condiciones para modificarse
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Getter de y
	 * @return Devuelve el valor de la coordenada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter de y
	 * @param y Valor de la coordenada y. No tiene condiciones para modificarse
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
}
