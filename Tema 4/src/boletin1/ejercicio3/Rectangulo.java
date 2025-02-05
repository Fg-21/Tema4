package boletin1.ejercicio3;

public class Rectangulo {
//Atributos de Rectagulo
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	/**
	 * Constructor del rectángulo
	 * @param x1 Primera Coordenada x
	 * @param y1 Primera Coordenada y
	 * @param x2 Segunda Coordenada x
	 * @param y2 Segunda Coordenada y
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
		System.out.println("holi esto es por molestar, nada más :D");
	}

	/**
	 * Getter de la primera coordenada X
	 * @return Devuelve la primera coordenada X
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Setter de la primera coordenada X
	 * @param x1 Modifica el valor de la primera coordenada X. No hay condiciones para modificar
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * Getter de la primera coordenada Y
	 * @return Devuelve la primera coordenada Y
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Setter de la primera coordenada Y
	 * @param y1 Modifica el valor de la primera coordenada Y. No hay condiciones para modificar
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * Getter de la segunda coordenada X
	 * @return Devuelve la segunda coordenada X
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Setter de la segunda coordenada X
	 * @param x2 Modifica el valor de la segunda coordenada X. No hay condiciones para modificar
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * Getter de la segunda coordenada Y
	 * @return Devuelve la segunda coordenada Y
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Setter de la segunda coordenada de Y
	 * @param y2 Modifica el valor de la segunda coordenada de Y. No hay condiciones para modificar
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	

}
