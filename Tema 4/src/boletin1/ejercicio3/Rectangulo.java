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
	
	/**
	 * Setter doble para modificar las coordenadas x1 e y1 a la vez
	 * @param x1  Modifica el valor de la primera coordenada X. No hay condiciones para modificar
	 * @param y1  Modifica el valor de la primera coordenada Y. No hay condiciones para modificar
	 */
	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	/**
	 * Setter doble para modificar las coordenadas x2 e y2 a la vez
	 * @param x2  Modifica el valor de la segunda coordenada X. No hay condiciones para modificar
	 * @param y2  Modifica el valor de la segunda coordenada Y. No hay condiciones para modificar
	 */
	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Setter cuádruple para modificar las coordenadas x1, y1, x2 e y2 a la vez
	 * @param x1  Modifica el valor de la primera coordenada X. No hay condiciones para modificar
	 * @param y1  Modifica el valor de la primera coordenada Y. No hay condiciones para modificar
	 * @param x2  Modifica el valor de la segunda coordenada X. No hay condiciones para modificar
	 * @param y2  Modifica el valor de la segunda coordenada Y. No hay condiciones para modificar
	 */
	public void setX1Y1X2Y2(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	/**
	 * Metodo que calcula el perímetro del objeto rectángulo
	 * @return Devuelve el perímetro del objeto rectángulo invocante
	 */
	public int getPerimeter() {
		int resultado = (Math.abs(x2 - x1) * 2 + (Math.abs(y2 - y1) * 2));
		
		//Devolvemos resultado
		return resultado;
	}
	/**
	 * Metodo que calcula el area del objeto rectagunlo
	 * @return Devuelve el área del objeto rectángulo invocante
	 */
	public double getArea() {
		double resultado = Math.abs(y2 - y1) * (x2 - x1);
		return resultado;
	}
	
	/**
	 * Metodo para revelar los atributos del objeto en forma de cadena
	 * @return Cadena con los atributos del objeto y sus valores
	 */
	public String toString() {
		return "X1: " + x1 + "\nY1: " + y1 + "\nX2: " + x2 + "\nY2: " + y2;
	}
	

}
