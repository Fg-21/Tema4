package boletin4.ej1;

public class Hora {
	private int hora = 0;
	private int minuto = 0;
	private int segundo = 0;
	
	/**
	 * Constructor de la clase hora con hora, minuto y segungo
	 * @param hora Hora del tiempo actual
	 * @param minuto Minuto del tiempo actual
	 * @param segundo Segundo del tiempo actual
	 */
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * Getter del segundo
	 * @return Segundo de la hora
	 */
	public int getSegundo() {
		return segundo;
	}


	/**
	 * Getter de la hora
	 * @return Hora del tiempo
	 */
	public int getHora() {
		return hora;
	}


	/**
	 * Getter del minuto
	 * @return Minuto de la hora
	 */
	public int getMinuto() {
		return minuto;
	}

	
	public void increase1Second() {
		
		this.segundo++;
		
		if (this.segundo >= 60) {
			this.segundo = 0;
			this.minuto++;
		}
		
		if (this.minuto >= 60) {
			this.minuto = 0;
			this.hora++;
		}
		
		if (this.hora >= 24) {
			this.hora = 0;
		}
		
	}
	
	@Override
	public String toString() {
		return this.hora + " : " + this.minuto + " : " + this.segundo; 
	}
	
	
	
	
	
}
