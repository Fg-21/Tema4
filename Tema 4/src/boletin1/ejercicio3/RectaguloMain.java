package boletin1.ejercicio3;

public class RectaguloMain {
	public static void main(String[] args) {
		// Objetos Rectangulo definidos y creados
		Rectangulo rec1 = new Rectangulo(0,0,5,5);
		Rectangulo rec2 = new Rectangulo(7,9,2,3);

		// Mostramos coords del rectangulo 1
		System.out.println("Coords rectangulo 1:");
		System.out.println("(" + rec1.getX1() + ", " + rec1.getY1() + ")");
		System.out.println("(" + rec1.getX2() + ", " + rec1.getY2() + ")");

		// Perímetro rectangulo 1
		System.out.println("Perímetro rectangulo 1: " + (Math.abs(rec1.getX2() - rec1.getX1()) * 4));

		// Area rectangulo 1
		System.out.println("Area del rectangulo 1: " + ((Math.abs(rec1.getX2() - rec1.getX1())) * (Math.abs(rec1.getY2() - rec1.getY1()))));

		// Salto de linea
		System.out.println();

		// Mostramos coords del rectangulo 2
		System.out.println("Coords rectangulo 2:");
		System.out.println("(" + rec2.getX1() + ", " + rec2.getY1() + ")");
		System.out.println("(" + rec2.getX2() + ", " + rec2.getY2() + ")");

		// Perímetro rectangulo 2
		System.out.println(
				"Perímetro rectangulo 2: " + (Math.abs(rec2.getX2() - rec2.getX1()) * 2 + (Math.abs(rec2.getY2() - rec2.getY1()) * 2)));

		// Area rectangulo 2
		System.out.println("Area del rectangulo 1: " + (Math.abs((rec2.getY2() - rec2.getY1()) * (rec2.getX2() - rec2.getX1()))));

		// Modificamos los datos de las coordenadas
		rec1.setX1(2);
		rec1.setY1(6);
		rec1.setX2(8);
		rec1.setY2(3);

		rec2.setX1(1);
		rec2.setY1(8);
		rec2.setX2(5);
		rec2.setY2(0);

		// Volvemos a hacer las operaciones
		// Mostramos coords del rectangulo 1
		System.out.println("Coords rectangulo 1:");
		System.out.println("(" + rec1.getX1() + ", " + rec1.getY1() + ")");
		System.out.println("(" + rec1.getX2() + ", " + rec1.getY2() + ")");

		// Perímetro rectangulo 1
		System.out.println("Perímetro rectangulo 1: " + (Math.abs(rec1.getX2() - rec1.getX1()) * 4));

		// Area rectangulo 1
		System.out.println("Area del rectangulo 1: " + ((Math.abs(rec1.getX2() - rec1.getX1())) * (Math.abs(rec1.getY2() - rec1.getY1()))));

		// Salto de linea
		System.out.println();

		// Mostramos coords del rectangulo 2
		System.out.println("Coords rectangulo 2:");
		System.out.println("(" + rec2.getX1() + ", " + rec2.getY1() + ")");
		System.out.println("(" + rec2.getX2() + ", " + rec2.getY2() + ")");

		// Perímetro rectangulo 2
		System.out.println(
				"Perímetro rectangulo 2: " + (Math.abs(rec2.getX2() - rec2.getX1()) * 2 + (Math.abs(rec2.getY2() - rec2.getY1()) * 2)));

		// Area rectangulo 2
		System.out.println("Area del rectangulo 1: " + (Math.abs((rec2.getY2() - rec2.getY1()) * (rec2.getX2() - rec2.getX1()))));

	}
}
