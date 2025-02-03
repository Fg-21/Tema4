package boletin1.ejercicio4;

public class ArticuloMain {
	public static void main(String[] args) {
		// Objeto de Articulo
		Articulo art = new Articulo();

		// Asignamos valores a sus atributos
		art.nombre = "Teclado";
		art.precioSinIVA = 8;
		art.cuantosQuedan = 10;

		// Imprimimos
		System.out.println(art.nombre + " Precio: " + (art.precioSinIVA + (art.precioSinIVA * (art.IVA / 100)))
				+ "€ Quedan: " + art.cuantosQuedan);

		// Modificamos datos
		art.precioSinIVA = 9;
		art.cuantosQuedan = 4;

		// Imrimimos de nuevo
		System.out.println(art.nombre + " Precio: " + (art.precioSinIVA + (art.precioSinIVA * (art.IVA / 100)))
				+ "€ Quedan: " + art.cuantosQuedan);
	}
}
