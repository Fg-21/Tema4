package boletin1.ejercicio3;

public class RectaguloMain {
	public static void main(String[] args) {
		// Objetos Rectangulo definidos y creados
		Rectangulo rec1 = new Rectangulo(0,0,5,5);

		// Mostramos coords del rectangulo 1
		System.out.println("Coords rectangulo 1:");
		System.out.println(rec1.toString());

		// Perímetro rectangulo 1
		System.out.println("Perímetro rectangulo 1: " + rec1.getPerimeter());

		// Area rectangulo 1
		System.out.println("Area del rectangulo 1: " + rec1.getArea());
	}
}
