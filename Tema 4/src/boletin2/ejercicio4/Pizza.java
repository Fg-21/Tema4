package boletin2.ejercicio4;

public class Pizza {
	// Enumerado del tamaño de cada pizza
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	// Enumerado del tipo de cada pizza
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	// Enumerado del estado de la pizza
	enum Estado {
		PEDIDA, SERVIDA
	}

	// Código de cada pizza
	private int codigo = 000000;
	
	// Tipo de la pizza
	private Tipo type = Tipo.MARGARITA;
	
	// Tamaño de la pizza
	private Tamaño size = Tamaño.MEDIANA;
	
	//Estado de la pizza
	private Estado state = Estado.PEDIDA;

	/**
	 * Constructor de la Pizza
	 * 
	 * @param codigo Codigo de identificación de cada Pizza
	 * @param size   Tamaño de la pizza
	 * @param type   Tipo/Sabor de la Pizza
	 */
	public Pizza(int codigo, String size, String type) {
		this.codigo = codigo;
		sizeComp(size.toUpperCase());
		typeComp(type.toUpperCase());
	}

	/**
	 * Getter del código de la pizza
	 * @return Devuelve el código de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter del Código de la pizza. No se pueden poner negativo
	 * @param codigo El código de la pizza
	 */
	public void setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Getter del tamaño de la pizza
	 * @return Devuelve el tamaño de la pizza
	 */
	public Tamaño getSize() {
		return size;
	}

	/**
	 * Setter del tamaño de la pizza
	 * @param size El tamaño de la pizza. No puede ser null nu estar vacío
	 */
	public void setSize(String size) {
		sizeComp(size.toUpperCase());
	}
	
	/**
	 * Getter del tipo de la pizza
	 * @return Devuelve el tipo de la pizza
	 */
	public Tipo getType() {
		return type;
	}

	/**
	 * Setter del tipo de la Pizza
	 * @param type El tipo de la Pizza
	 */
	public void setType(String type) {
		typeComp(type.toUpperCase());
	}

	/**
	 * Getter del estado de la pizza
	 * @return Devuelve el estado de la pizza
	 */
	public Estado getState() {
		return state;
	}
	
	/**
	 * Setter del estado de la pizza, no se pueden poner otros estados que no sean PEDIDA o SERVIDA
	 * @param estado El estado de la pizza
	 */
	public void setState(String estado) {
		stateComp(estado.toUpperCase());
		
	}
	
	
	
	/**
	 * Metodo para comprobar la asignación correcta del tamaño de la pizza
	 * @param size El tamaño de la pizza
	 */
	private void sizeComp(String size) {
		switch (size) {
		case "MEDIANA" -> {
			this.size = Tamaño.MEDIANA;
		}
		case "FAMILIAR" -> {
			this.size = Tamaño.FAMILIAR;
		}
		default ->{
			this.size = Tamaño.MEDIANA;
		}
		}
	}
	
	/**
	 * Método para comprobar la correcta asignación del tipo de la pizza
	 * @param type El tipo de la Pizza
	 */
	private void typeComp(String type) {
		switch (type) {
		case "MARGARITA"->{
			this.type = Tipo.MARGARITA;
		}
		case "CUATRO_QUESOS"->{
			this.type = Tipo.CUATRO_QUESOS;
		}
		case "FUNGHI"->{
			this.type = Tipo.FUNGHI;
		}
		default ->{
			this.type = Tipo.MARGARITA;
		}
		}
	}
	
	/**
	 * Metodo para comprobar la correcta asignación del estado de la pizza
	 * @param state El estado de la pizza
	 */
	private void stateComp(String state) {
		switch(state) {
		case "PEDIDA" ->{
			this.state = Estado.PEDIDA;
		}
		case "SERVIDA" ->{
			this.state = Estado.SERVIDA;
		}
		default ->{
			this.state = Estado.PEDIDA;
		}
		}
	}
	
	/**
	 * To String que muestra los atributos de la pizza por consola
	 */
	public String toString() {
		return this.codigo + " " + this.size + " - " + this.type + " - " + this.state; 
	}
	
	/**
	 * Método que sobreescribe el equals de la clase object
	 * @param Objeto Pizza
	 */
	public boolean equals(Object pizza) {
		boolean iguales = false;
		Pizza pizzaParam = (Pizza) pizza;
		
		if (pizzaParam.codigo == this.codigo) {
			iguales = true;
		}
		return iguales;
	}
	
}
