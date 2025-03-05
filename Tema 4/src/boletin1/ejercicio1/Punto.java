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
	
	
	/**
	 * Es un setter doble que modifica los valores de x e y. No hay condiciones para modificarse
	 * @param x Valor de la coordenada X
	 * @param y Valor de la coordenada Y
	 */
	public void setXY(int x, int y)	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Desplaza las coordenadas la cantidad de unidades pasada por parámetro
	 * @param dx Desplazamiento de la coordenada X
	 * @param dy Desplazamiento de la coordenada Y
	 */
	public void desplaza(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	
	/**
	 * Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro
	 * @param p Objeto con unas coordenadas x e y
	 * @return Distancia entre el objeto que llama y el objeto que se pasa como parámetro
	 */
	public double distancia(Punto p) {
		double resultado;
		resultado = Math.sqrt(Math.pow((this.x - this.y) , 2) + Math.pow((p.x - p.y), 2));
		return resultado;
	}
	
	/**
	 * Devuelve una cadena con las coordenadas del obeto
	 */
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	
}
