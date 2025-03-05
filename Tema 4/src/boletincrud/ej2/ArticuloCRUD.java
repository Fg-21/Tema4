package boletincrud.ej2;

import java.util.ArrayList;

public class ArticuloCRUD {

	static ArrayList <Articulo> articulos = new ArrayList<Articulo>(); 
	
	
	/**
	 * Hace un listado los articulos de la lista
	 */
	public static void listado() {
		for (Articulo art : articulos) {
			System.out.println(art);
		}
	}
	
	/**
	 * Da de alta un articulo en la lista de articulos
	 * @param nombre Nombre del artículo
	 * @param precioSinIVA Precio del artículo sin el IVA
	 * @param stock Cantidad del artículo que queda en el almacén
	 * @return Devuelve true si el articulo se añade correctamente y false en caso contrario
	 */
	public static boolean altaArt(String nombre,  double precioSinIVA, int stock) {
		Articulo art = new Articulo(nombre, precioSinIVA, stock);
		return articulos.add(art);
	}
	
	/**
	 * Da de baja un artículo en la lista de articulos
	 * @param nombre Nombre del Artículo a eliminar
	 * @return Devuelve true si se elimina correctamente y false en caso contrario
	 */
	public static boolean bajaArt(String nombre) {
		Articulo art = new Articulo(nombre);
		return articulos.remove(art);
	}
	
	/**
	 * Modifica el precio de un articulo 
	 * @param nombre Nombre del articulo
	 * @param nuevoPrecio Precio nuevo del articulo
	 */
	public static void modArt(String nombre, double nuevoPrecio) {
		for (Articulo art : articulos) {
			if (art.getNombre().equals(nombre)) {
				art.setPrecioSinIVA(nuevoPrecio);
			}
		}
	}
	
	/**
	 * Metodo que añade mercancia indicada al almacen
	 * @param nombre Nombre del articulo al cual se le va a agregar mercancia
	 * @param merca Mercancia a agregar al almacén
	 */
	public static void entradaMerca(String nombre, int merca) {
		for (Articulo art : articulos) {
			if (art.getNombre().equals(nombre)) {
				art.setCuantosQuedan(art.getCuantosQuedan()+merca);
			}
		}
	}
	
	
	/**
	 * Metodo que elimina mercancia del stock, no se puede eliminar mas mercancia de la que hay en stock
	 * @param nombre Nombre del articulo al cual se le va a quitar stock
	 * @param merca Stock que va a salir del almacén
	 */
	public static void salidaMerca(String nombre, int merca) {
		for (Articulo art : articulos) {
			if (art.getNombre().equals(nombre) && art.getCuantosQuedan() > merca) {
				art.setCuantosQuedan(art.getCuantosQuedan()-merca);
			}
		}
	}
	
	
}
