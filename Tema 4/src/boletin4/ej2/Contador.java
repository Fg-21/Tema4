package boletin4.ej2;

public class Contador {
	/**
	 * Atributo Contador
	 */
	private int cont;

	/**
	 * Constructor de contador, no puede ser negativo
	 * @param cont
	 */
	public Contador(int cont) {
		if(cont > 0) {
			this.cont= cont;
		}
	}

	/**
	 * Getter del contador
	 * @return El numero del contador
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Setter del contador, no se puede modificar a valores negativos
	 * @param cont
	 */
	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Metodo que incrementa en una unidad el valor de cont
	 */
	public void incrementar() {
		this.cont++;
	}
	
	/**
	 * Metodo que decrementa en una unidad el valor de cont. 
	 * Si el numero a decrementar es negativo o 0, se asiga 0 a este valor
	 * @return True si se ha decrementado y false en caso contrario
	 */
	public boolean decrementar() {
		boolean decremented = false;
		
		if (this.cont > 0) {
			this.cont--;
			decremented = true;
		} else {
			this.cont = 0;
		}
		return decremented;
	}
	
	
	
}
