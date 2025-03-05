package boletincrud.ej4;

public class Disco {

	//Enum del genero del disco
	enum Genero{
		ROCK, POP, JAZZ, BLUES
	}
	
	private int codigo = 0;
	private String autor = "Nadie";
	private String tituto = "Ninguno";
	private int duracion = 0;
	private Genero genre = Genero.ROCK;
	
	/**
	 * Constructor del Disco con todos sus atributos
	 * @param codigo Codigo del disco
	 * @param autor Autor del disco
	 * @param titulo Título del disco
	 * @param duracion Duracion del disco en segundos
	 * @param genero Genero del disco
	 */
	Disco(int codigo, String autor, String titulo, int duracion, String genero){
		this.codigo = codigo;
		this.autor = autor;
		this.tituto = titulo;
		duracomp(genero.toUpperCase());
		
	}
	
	/**
	 * Metodo para la comprobar la correcta asignacion de generos
	 * @param genero Genero del Disco
	 */
	private void duracomp(String genero) {
		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> this.genre = Genero.valueOf(genero);
		}
	}
	
}
