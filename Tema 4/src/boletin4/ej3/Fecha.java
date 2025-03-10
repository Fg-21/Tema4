package boletin4.ej3;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	/**
	 * Constructor de Fecha con el dia, el mes y el año
	 * 
	 * @param dia Dia de la fecha
	 * @param mes Mes de la fecha
	 * @param año Año de la fecha
	 */
	public Fecha(int dia, int mes, int año) {

		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}

		if (año >= 1) {
			this.año = año;
		}
		
		this.dia = dia;

		if (!this.fechaCorrecta()) {
			this.dia = 1;
		}

	}
	
	/**
	 * Metodo que comprueba si el año de la fecha es bisiesto
	 * 
	 * @return Devuelve True si es bisiesto y false en caso contrario
	 */
	public boolean esBissiesto() {
		return this.año % 4 == 0 && this.año % 100 != 0 || this.año % 400 == 0;
	}

	/**
	 * Metodo que comprueba si la fecha es correcta o no
	 * 
	 * @return Devuelve True si la fecha es correcta y false en caso contrario
	 */
	public boolean fechaCorrecta() {
		boolean res = false;

		switch (this.mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (this.dia <= 31 && this.dia > 0) {
				res = true;
			}
		}
		case 2 -> {
			if (this.esBissiesto()) {
				if (this.dia <= 29 && this.dia > 0) {
					res = true;
				} else if (this.dia <= 28 && this.dia > 0) {
					res = true;
				}
			}
		}

		case 4, 6, 9, 11 -> {
			if (this.dia <= 30 && this.dia > 0) {
				res = true;
			}
		}
		}

		return res;
	}

	/**
	 * Metodo que incrementa un dia en la fecha
	 */
	public void diaSiguiente() {
		this.dia++;

		if (!this.fechaCorrecta()) {
			this.dia = 1;
			this.mes++;
			if (!this.fechaCorrecta()) {
				this.mes = 1;
				this.año++;
			}
			
//			switch (this.mes) {
//			case 1, 3, 5, 7, 8, 10 -> {
//				if (this.dia > 31) {
//					this.mes++;
//				}
//				
//			}
//			case 12 -> {
//				this.año++;
//				this.mes = 1;
//			}
//			case 2 -> {
//				if (this.esBissiesto()) {
//					if (this.dia > 29) {
//						this.mes++;
//					}
//				} else if (this.dia > 28) {
//					this.mes++;
//				}
//			}
//			case 4, 6, 9, 11 ->{
//				if (this.dia > 30) {
//					this.mes++;
//				}
//			}
//			}
		}
	}
	
	/**
	 * Metodo to String que sobreescribe al de la clase Objects
	 */
	@Override
	public String toString() {
		String res = "";
		if (this.dia / 10 == 0) {
			res ="0" + this.dia + "-";
		} else {
			res = this.dia + "-";
		}
		
		if (this.mes / 10 == 0) {
			res += "0" + this.mes + "-";
		} else {
			res += this.mes + "-";
		}
		
		res += this.año;
		return res;
	}

}
