package boletincrud.ej4;

import java.util.HashSet;

public class DiscoCRUD {
	static HashSet<Disco> discos = new HashSet<Disco>();

	public static void listado() {
		for (Disco disco : discos) {
			System.out.println(disco);
		}
	}

	/**
	 * Metodo que añade el disco al conjunto
	 * 
	 * @param d Objeto disco que se va a añadir al conjunto
	 * @return True si se ha añadido, false en caso contrario
	 */
	public static boolean addDisco(Disco d) {
		return discos.add(d);
	}

	/**
	 * Metodo que borra un disco en el conjunto
	 * 
	 * @param d Objeto disco a eliminar
	 * @return True si lo elimina correctamente, false en caso contrario
	 */
	public static boolean delDisco(Disco d) {
		return discos.remove(d);
	}

	/**
	 * Metodo para hecer una busqueda de un objeto en la lista
	 * 
	 * @param disc Objeto disco para buscar
	 * @return Devuelve el objeto disco encontrado o null en caso de que no lo
	 *         encuentre
	 */
	private static Disco buscaD(Disco disc) {
		Disco finded = null;

		for (Disco disco : discos) {
			if (disco.equals(disc)) {
				finded = disco;
			}
		}

		return finded;
	}

	/**
	 * Metodo que modifica el nombre del disco
	 * 
	 * @param disc   Disco a modificar el nombre
	 * @param nombre Nombre nuevo del disco
	 * @return Devuelve true si se modifica correctamente y false en caso contrario
	 */
	public static boolean modDisc(Disco disc, String nombre) {
		boolean modded = false;

		Disco disquete = buscaD(disc);
		if (disquete != null) {
			disquete.setAutor(nombre);
			modded = true;
		}
		return modded;
	}
}
