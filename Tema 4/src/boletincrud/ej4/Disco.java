package boletincrud.ej4;

<<<<<<< HEAD
import java.util.Objects;

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
		this.duracion = duracion;
		duracomp(genero.toUpperCase());
		
	}
	
	
	/**
	 * Constructor del disco solo con el codigo
	 * @param codigo
	 */
	public Disco(int codigo) {
		super();
		this.codigo = codigo;
	}

	/**
	 * Getter del codigo
	 * @return Devuelve el codigo del disco
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * Getter del autor
	 * @return Devuelve el autor del disco
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * Setter del autor
	 * @param autor Nombre del autor para modificar
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


/**
 * Getter del titulo
 * @return Devuelve el titulo del disco
 */
	public String getTituto() {
		return tituto;
	}


/**
 * Getter de la duracion del disco
 * @return Devuelve la duracion del disco
 */
	public int getDuracion() {
		return duracion;
	}


/**
 * Getter del genero del disco
 * @return Devuelve el genero del disco
 */
	public Genero getGenre() {
		return genre;
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
	
	@Override
	public String toString() {
		return this.codigo + " " + this.autor + " " + this.tituto + " " + this.duracion + " " + this.genre;   
	}
	
	/**
	 * Metodo hash que sobrescribe el hash de Objects
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	/**
	 * Metodo equals que sobrescribe el equals de Object, 2 discos son iguales si tienen el mismo codigo
	 */
	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		
		Disco disco = (Disco) obj;
		if (this.codigo == disco.codigo) {
			equal = true;
		}
		
		return equal;
=======
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
>>>>>>> branch 'master' of https://github.com/Fg-21/Tema4.git
	}
	
}
