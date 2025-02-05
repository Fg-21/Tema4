package boletin1.ejercicio4;

public class ArticuloMain {
	public static void main(String[] args) {
		// Objeto de Articulo con valores asignados
		Articulo art = new Articulo("Nombre Exageradamente Largo", -1,-10);

		// Imprimimos
		System.out.println(art.getNombre() + ": Precio: " + (art.getPrecioSinIVA() + (art.getPrecioSinIVA() * (Articulo.IVA / 100)))
				+ "€ Quedan: " + art.getCuantosQuedan());

		// Modificamos datos
		art.setNombre("Teclado");
		art.setPrecioSinIVA(9);
		art.setCuantosQuedan(4);
		
		//Imprimimos que los datos se han modificado
		System.out.println("\n--DATOS MODIFICADOS--\n");
		

		// Imrimimos de nuevo
		System.out.println(art.getNombre() + ": Precio: " + (art.getPrecioSinIVA() + (art.getPrecioSinIVA() * (Articulo.IVA / 100)))
				+ "€ Quedan: " + art.getCuantosQuedan());
	}
}
