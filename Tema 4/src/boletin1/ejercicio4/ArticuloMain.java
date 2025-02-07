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
		
		//Obtenemos el precio de venta al público
		System.out.println(art.getPVP());
		
		//Obtenemos el PVP con un descento del 30%
		System.out.println(art.getPVPDescuento(30));
		
		//Vendemos 2 artículos
		art.vender(2);
		
		//Almacenamos 5 artículos
		art.almacenar(5);
		
		//Mostramos los atributos de los artículos
		System.out.println(art);
	}
}
