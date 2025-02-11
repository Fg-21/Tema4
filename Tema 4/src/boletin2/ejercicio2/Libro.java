package boletin2.ejercicio2;

public class Libro {

	// Título del libro
	private String title = "Predeterminado";

	// Autor del libro
	private String autor = "Sin autor específico";

	// Número de ejemplares del libro
	private int nEjemplares = 0;

	// Número de ejemplares del libro prestados
	private int nPrestados = 0;

	// Posibles géneros de los que puede ser el libro
	enum generoLibro {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}

	// Género por defecto del libro
	private generoLibro genero = generoLibro.NARRATIVO;

	/**
	 * Constructor de Libro con el título y el autor
	 * 
	 * @param titulo Título del libro
	 * @param autor  Autor del libro
	 */
	Libro(String titulo, String autor) {
		this.title = titulo;
		this.autor = autor;
	}

	/**
	 * Constructor de Libro con el título, el autor, el número de Ejemplares y el
	 * numero de libros prestados
	 * 
	 * @param titulo      Título del Libro
	 * @param autor       Autor del Libro
	 * @param nEjemplares Ejemplares totales del Libro
	 * @param nPrestados  Número de Libros prestados
	 */
	Libro(String titulo, String autor, int nEjemplares, int nPrestados) {
		this.title = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
	}

	/**
	 * Constructor de Libro con el título, el autor, el número de Ejemplares, el
	 * numero de libros prestados y el género
	 * 
	 * @param titulo      Título del Libro
	 * @param autor       Autor del Libro
	 * @param nEjemplares Ejemplares totales del Libro
	 * @param nPrestados  Número de Libros prestados
	 * @param genero      Género del Libro
	 */
	Libro(String titulo, String autor, int nEjemplares, int nPrestados, String genero) {
		this.title = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
		switch (genero){
			case "LÍRICO" ->{
				this.genero = generoLibro.LÍRICO;
			}
			case "DRAMÁTICO" ->{
				this.genero = generoLibro.DRAMÁTICO;
			}
			case "DIDÁCTICO" ->{
				this.genero = generoLibro.DIDÁCTICO;
			}
			case "POÉTICO" ->{
				this.genero = generoLibro.POÉTICO;
			}
			default ->{
				this.genero = generoLibro.NARRATIVO;
			}
		}
	}

	/**
	 * Getter del Título del Libro
	 * 
	 * @return Devuelve el Título del Libro
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter del título del Libro
	 * 
	 * @param Título del libro a modificar. No se puede modificar a un título vacío
	 *               ni a null
	 */
	public void setTitle(String title) {
		if (title != "" && title != null) {
			this.title = title;
		}

	}

	/**
	 * Getter de Autor
	 * 
	 * @return Devuelve el Autor del Libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Setter de autor
	 * 
	 * @param autor Modifica el nombre del autor del libro. No puede ser vacío ni
	 *              esta a null
	 */
	public void setAutor(String autor) {
		if (autor != "" && autor != null) {
			this.autor = autor;
		}
	}

	/**
	 * Getter del número de ejemplares
	 * 
	 * @return Devuelve el número de ejemplares del Libro
	 */
	public int getnEjemplares() {
		return nEjemplares;
	}

	/**
	 * Getter del número de libros prestados
	 * 
	 * @return Devuelve los libros que están siendo prestados
	 */
	public int getnPrestados() {
		return nPrestados;
	}

	/**
	 * Setter del número de libros prestados
	 * 
	 * @param nPrestados Números de libros prestados a modificar. No se pueden
	 *                   prestar más libros de los que se tienen
	 */
	public void setnPrestados(int nPrestados) {
		if (nEjemplares <= nPrestados) {
			this.nPrestados = nPrestados;
		}
	}

	/**
	 * Getter del género del Libro
	 * 
	 * @return Devuelve el género del libro
	 */
	public generoLibro getGenero() {
		return genero;
	}

	/**
	 * Cojemos Libros prestados de los libros almacenados. No se pueden cojer más
	 * libros de los almacenados menos los prestados
	 * 
	 * @param nPrestados Cantidad de libros que vamos a pedir prestados
	 * @return True si se pueden prestar y false en caso contrario
	 */
	public boolean prestamo(int nPrestados) {
		boolean prestado = false;

		if ((this.nEjemplares - this.nPrestados) >= nPrestados) {
			this.nPrestados += nPrestados;
			prestado = true;

		}

		return prestado;
	}

	/**
	 * Devolvemos una cantidad de libros restando los libros prestados. No se pueden
	 * devolver más libros de los que se han prestado
	 * 
	 * @param devuelve Cantidad de libros a devolver
	 * @return True si se puede devolver y false en caso contrario
	 */
	public boolean devolucion(int devuelve) {
		boolean devuelto = false;

		if (devuelve <= this.nPrestados) {
			this.nPrestados -= devuelve;
			devuelto = true;
		}

		return devuelto;
	}

	/**
	 * Devuelve una cadena con la información del libro
	 */
	public String toString() {
		return "Título: " + title + "\nAutor: " + autor + "\nEjemplares: " + nEjemplares + "\nEjemplares Prestados: "
				+ nPrestados + "\nGénero: " + genero;
	}
	
	/**
	 * Devuelve true si el título y el autor del libro son iguales
	 */
	public boolean equals(Object libro) {
		boolean igual = false;
		
		Libro libroParam = (Libro) libro;
		
		if (this.title.equals(libroParam.title) && this.autor.equals(libroParam.autor)) {
			igual = true;
		}
		return igual; 
	}

}
