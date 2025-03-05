package boletincrud.ej5;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		//Objetos CuentaCorriente (dni y saldo)
		CuentaCorriente cuenta = new CuentaCorriente("321654988", 30);
		CuentaCorriente cuenta2 = new CuentaCorriente("321654987", 87);
		
		
		//sacamos dinero
		cuenta.sacaDinero(15);
		
		//Ingresamos dinero
		cuenta.ingresaDinero(60);
		
		//Miramos saldo
		System.out.println(cuenta.getSaldo());

		//Mostramos los atributos del objeto
		System.out.println(cuenta.toString());
		
		//Comparamos las 2 cuentas
		System.out.println(cuenta.equals(cuenta2));
		
	}
	
}
