package boletincrud.ej1;

import java.util.ArrayList;

public class AlumnoCRUD {
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	/**
	 * Listado de los elementos de la lista
	 */
	public static void listado() {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	/**
	 * Añade un nuevo alumno a la lista
	 * 
	 * @param nombre Nombre del alumno a añadir
	 * @param media  Media del alumno a añadir
	 * @return Devuelve true si se ha añadido correctamente y false en caso
	 *         contrario
	 */
	public static void addAlumno(String nombre, double media) {
		Alumno al = new Alumno(nombre, media);
		alumnos.add(al);
	}

	/**
	 * Busca entre los alumnos y si encuentra el indicado, reemplaza la media con la
	 * del parametro de entrada
	 * 
	 * @param nombre   Nombre del alumno a buscar
	 * @param mediaNew Media a reemplazar
	 */
	public static boolean modAlumno(String nombre, double mediaNew) {
		boolean modified = false;
		
		for (Alumno a1 : alumnos) {
			if (a1.getNombre().equals(nombre)) {
				a1.setMedia(mediaNew);
				modified = true;
			}
		}
		return modified;
	}

	/**
	 * Se busca el objeto con el nombre pasado por parámetro 
	 * @param nombre
	 * @return
	 */
	public static boolean delAlumno(String nombre) {
		Alumno a1 = new Alumno (nombre);
		return alumnos.remove(a1);
	}

}
