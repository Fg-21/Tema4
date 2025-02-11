package boletin2.ejercicio4;

public class Pizza {
	// Código de cada pizza
	private int codigo = 000000;

	// Tamaño de cada pizza
	enum tamaño {
		MEDIANA, FAMILIAR
	}

	private tamaño size = tamaño.MEDIANA;

	// Tipo de cada pizza
	enum tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	private tipo type = tipo.MARGARITA;

	// Estado de la pizza
	enum estado {
		PEDIDA, SERVIDA
	}

	private estado state = estado.PEDIDA;

	/**
	 * Constructor de la Pizza
	 * 
	 * @param codigo Codigo de identificación de cada Pizza
	 * @param size   Tamaño de la pizza
	 * @param type   Tipo/Sabor de la Pizza
	 */
	Pizza(int codigo, String size, String type) {
		this.codigo = codigo;

		switch (size) {
		case "MEDIANA" -> {
			this.size = tamaño.MEDIANA;
		}
		case "FAMILIAR" -> {
			this.size = tamaño.FAMILIAR;
		}
		default ->{
			this.size = tamaño.MEDIANA;
		}
		}
		
		switch (type) {
		case "MARGARITA"->{
			this.type = tipo.MARGARITA;
		}
		case "CUATRO_QUESOS"->{
			this.type = tipo.CUATRO_QUESOS;
		}
		case "FUNGHI"->{
			this.type = tipo.FUNGHI;
		}
		default ->{
			this.type = tipo.MARGARITA;
		}
		}
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
	public tamaño getSize() {
		return size;
	}

	/**
	 * Setter del tamaño de la pizza
	 * @param size El tamaño de la pizza. No puede ser null nu estar vacío
	 */
	public void setSize(tamaño size) {
		this.size = size;
	}
	
	/**
	 * Getter del tipo de la pizza
	 * @return Devuelve el tipo de la pizza
	 */
	public tipo getType() {
		return type;
	}

	/**
	 * Setter del tipo de la Pizza
	 * @param type El tipo de la Pizza
	 */
	public void setType(tipo type) {
		this.type = type;
	}

	public estado getState() {
		return state;
	}
	
	
}
