package boletin1.ejercicio3;

public class RectaguloMain {
	public static void main(String[] args) {
		// Objetos Rectangulo
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		// Asignamos valores a los atributos de cada rectágulo
		rec1.x1 = 0;
		rec1.y1 = 0;
		rec1.x2 = 5;
		rec1.y2 = 5;

		rec2.x1 = 7;
		rec2.y1 = 9;
		rec2.x2 = 2;
		rec2.y2 = 3;

		// Mostramos coords del rectangulo 1
		System.out.println("Coords rectangulo 1:");
		System.out.println("(" + rec1.x1 + ", " + rec1.y1 + ")");
		System.out.println("(" + rec1.x2 + ", " + rec1.y2 + ")");

		// Perímetro rectangulo 1
		System.out.println("Perímetro rectangulo 1: " + (Math.abs(rec1.x2 - rec1.x1) * 4));

		// Area rectangulo 1
		System.out.println("Area del rectangulo 1: " + ((Math.abs(rec1.x2 - rec1.x1)) * (Math.abs(rec1.y2 - rec1.y1))));

		// Salto de linea
		System.out.println();

		// Mostramos coords del rectangulo 2
		System.out.println("Coords rectangulo 2:");
		System.out.println("(" + rec2.x1 + ", " + rec2.y1 + ")");
		System.out.println("(" + rec2.x2 + ", " + rec2.y2 + ")");

		// Perímetro rectangulo 2
		System.out.println(
				"Perímetro rectangulo 2: " + (Math.abs(rec2.x2 - rec2.x1) * 2 + (Math.abs(rec2.y2 - rec2.y1) * 2)));

		// Area rectangulo 2
		System.out.println("Area del rectangulo 1: " + (Math.abs((rec2.y2 - rec2.y1) * (rec2.x2 - rec2.x1))));

		// Modificamos los datos de las coordenadas
		rec1.x1 = 2;
		rec1.y1 = 6;
		rec1.x2 = 8;
		rec1.y2 = 3;

		rec2.x1 = 1;
		rec2.y1 = 8;
		rec2.x2 = 5;
		rec2.y2 = 0;

		// Volvemos a hacer las operaciones
		// Mostramos coords del rectangulo 1
		System.out.println("Coords rectangulo 1:");
		System.out.println("(" + rec1.x1 + ", " + rec1.y1 + ")");
		System.out.println("(" + rec1.x2 + ", " + rec1.y2 + ")");

		// Perímetro rectangulo 1
		System.out.println("Perímetro rectangulo 1: " + (Math.abs(rec1.x2 - rec1.x1) * 4));

		// Area rectangulo 1
		System.out.println("Area del rectangulo 1: " + ((Math.abs(rec1.x2 - rec1.x1)) * (Math.abs(rec1.y2 - rec1.y1))));

		// Salto de linea
		System.out.println();

		// Mostramos coords del rectangulo 2
		System.out.println("Coords rectangulo 2:");
		System.out.println("(" + rec2.x1 + ", " + rec2.y1 + ")");
		System.out.println("(" + rec2.x2 + ", " + rec2.y2 + ")");

		// Perímetro rectangulo 2
		System.out.println(
				"Perímetro rectangulo 2: " + (Math.abs(rec2.x2 - rec2.x1) * 2 + (Math.abs(rec2.y2 - rec2.y1) * 2)));

		// Area rectangulo 2
		System.out.println("Area del rectangulo 1: " + (Math.abs((rec2.y2 - rec2.y1) * (rec2.x2 - rec2.x1))));

	}
}
